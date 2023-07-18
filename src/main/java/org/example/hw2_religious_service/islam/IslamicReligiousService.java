package org.example.hw2_religious_service.islam;

import org.example.hw2_religious_service.Religion;
import org.example.hw2_religious_service.ReligiousService;
import org.example.util.Util;

public class IslamicReligiousService extends ReligiousService {
    private String location;

    public IslamicReligiousService(String name,
                                   Integer duration,
                                   Long price,
                                   String location) {
        super(name, Religion.ISLAM, duration, price);
        this.location = (String) Util.checkIfNull(location, location);
    }

    public void performHajj() {
        System.out.println("Join the pilgrims at " + location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = (String) Util.checkIfNull(location, location);
    }
}
