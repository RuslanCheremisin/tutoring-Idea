package org.example.hw2_religious_service;

import java.util.ArrayList;
import java.util.List;

import static org.example.util.Util.checkIfNull;

public class ReligiousServiceCollection {
    private List<ReligiousService> serviceList = new ArrayList<>();

    public void addService(ReligiousService service) {
        serviceList.add((ReligiousService) checkIfNull(service, "service"));
    }

    public List<ReligiousService> getServices() {
        return List.copyOf(serviceList);
    }

    public Long getTotalServicePrice() {
        return serviceList.stream().mapToLong(ReligiousService::getPrice).sum();
    }

    public Integer getTotalServiceDuration(){
        return serviceList.stream().mapToInt(ReligiousService::getDuration).sum();
    }
}
