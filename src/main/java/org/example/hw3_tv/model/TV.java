package org.example.hw3_tv.model;

import org.example.hw3_tv.service.TVService;

public class TV implements TVService {
    private TVRemote remote;
    private TVChannel currentChannel;


    public TV(TVChannel currentChannel, TVRemote remote) {
        this.currentChannel = currentChannel;
        this.remote = remote;
    }

    @Override
    public void showCurrentChannel() {
        currentChannel = remote.getCurrentChannel();
        System.out.println(currentChannel.getChannelNumber() + ": " + "\"" + currentChannel.getChannelName() + "\"");
    }
}
