package org.example.hw3_tv.model;

import org.example.hw3_tv.service.TVRemoteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TVRemote implements TVRemoteService {
    private TVChannel currentChannel;
    private List<TVChannel> channelList = new ArrayList<>();

    @Override
    public void setCurrentChannel(Integer channelNo) {
        currentChannel = channelList.stream().filter(c -> c.getChannelNumber().equals(channelNo)).findFirst().orElseThrow();
        System.out.println("Current channel: " + channelNo);
    }

    @Override
    public void addChannel(TVChannel channel) {
        Optional<TVChannel> channelOpt = Optional.ofNullable(channel);
        if (channelOpt.isPresent()) {
            if (channelList.stream().map(TVChannel::getChannelNumber).noneMatch(n -> n.equals(channel.getChannelNumber()))) {
                channelList.add(channel);
            } else {
                throw new IllegalArgumentException("Channel with such channel number already exists!");
            }
        } else {
            throw new IllegalArgumentException("channel is null!");
        }
        System.out.println("Channel " + channel.getChannelName() + " is added");
    }

    @Override
    public void removeChannel(TVChannel channel) {
        Optional<TVChannel> channelOpt = Optional.ofNullable(channel);
        if (channelOpt.isPresent()) {
            if (!channelList.remove(channel)) {
                throw new IllegalArgumentException("no such channel in the list!");
            } else {
                System.out.println("channel " + channel.getChannelName() + " is removed");
                currentChannel = channelList.get(0);
            }
        } else {
            throw new IllegalArgumentException("channel is null!");
        }
    }

    public void showAddedChannels(){
        channelList.stream().forEach(System.out::println);

    }

    TVChannel getCurrentChannel(){
        return currentChannel;
    }

}
