package org.example.hw3_tv.model;

import java.util.Objects;

public class TVChannel {
    private String channelName;
    private Integer channelNumber;

    public TVChannel(String channelName, Integer channelNumber) {
        this.channelName = channelName;
        this.channelNumber = channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVChannel tvChannel = (TVChannel) o;
        return Objects.equals(channelName, tvChannel.channelName) && Objects.equals(channelNumber, tvChannel.channelNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelName, channelNumber);
    }

    @Override
    public String toString() {
        return channelNumber + ": " + channelName;
    }
}
