package org.example.hw2_religious_service.model.islam;

import org.example.hw2_religious_service.model.Religion;
import org.example.hw2_religious_service.model.ReligiousMinistry;
import org.example.util.Util;

public class IslamicReligiousMinistry extends ReligiousMinistry {
    private String location;

    public IslamicReligiousMinistry(String name,
                                    Integer duration,
                                    Long price,
                                    String location) {
        super(name, Religion.ISLAM, duration, price);
        this.location = (String) Util.checkIfNull(location, location);
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = (String) Util.checkIfNull(location, location);
    }
}
