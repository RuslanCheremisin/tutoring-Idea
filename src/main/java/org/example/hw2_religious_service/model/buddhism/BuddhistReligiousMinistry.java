package org.example.hw2_religious_service.model.buddhism;

import org.example.hw2_religious_service.model.Religion;
import org.example.hw2_religious_service.model.ReligiousMinistry;
import org.example.util.Util;

public class BuddhistReligiousMinistry extends ReligiousMinistry {
    private Language language;

    public BuddhistReligiousMinistry(String name,
                                     Integer duration,
                                     Long price,
                                     Language language) {
        super(name, Religion.BUDDHISM, duration, price);
        this.language = (Language) Util.checkIfNull(language, "language");
    }


}
