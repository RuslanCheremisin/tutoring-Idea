package org.example.hw3_tv.service;

import org.example.hw3_tv.model.TVChannel;

public interface TVRemoteService {

    void setCurrentChannel(Integer channelNo);

    void addChannel(TVChannel channel);

    void removeChannel(TVChannel channel);

}
