package org.example.hw2_religious_service.service;

import org.example.hw2_religious_service.model.ReligiousMinistry;

import java.util.ArrayList;
import java.util.List;

import static org.example.util.Util.checkIfNull;

public interface ReligiousMinistryService {
    List<ReligiousMinistry> serviceList = new ArrayList<>();

    void addService(ReligiousMinistry service);

    List<ReligiousMinistry> getServices();

    Long getTotalServicePrice();

    Integer getTotalServiceDuration();
}
