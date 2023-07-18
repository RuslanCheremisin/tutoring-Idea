package org.example.hw2_religious_service.service.impl;

import org.example.hw2_religious_service.model.ReligiousMinistry;
import org.example.hw2_religious_service.model.christianity.ChristianReligiousMinistry;
import org.example.hw2_religious_service.service.ReligiousMinistryService;

import java.util.ArrayList;
import java.util.List;

import static org.example.util.Util.checkIfNull;

public class ChristianMinistryServiceImpl implements ReligiousMinistryService {
    private List<ChristianReligiousMinistry> serviceList = new ArrayList<>();

    public void addService(ReligiousMinistry service) {
        serviceList.add((ChristianReligiousMinistry) checkIfNull(service, "service"));
    }

    public List<ReligiousMinistry> getServices() {
        return List.copyOf(serviceList);
    }

    public Long getTotalServicePrice() {
        return serviceList.stream().mapToLong(ReligiousMinistry::getPrice).sum();
    }

    public Integer getTotalServiceDuration(){
        return serviceList.stream().mapToInt(ReligiousMinistry::getDuration).sum();
    }

    public void performBaptism() {
        System.out.println("In the name of Father, Son and Holy Spirit, you will be baptised");
    }

}
