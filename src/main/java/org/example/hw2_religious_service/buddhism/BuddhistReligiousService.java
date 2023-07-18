package org.example.hw2_religious_service.buddhism;

import org.example.hw2_religious_service.Religion;
import org.example.hw2_religious_service.ReligiousService;
import org.example.util.Util;

public class BuddhistReligiousService extends ReligiousService {
    private Language language;

    public BuddhistReligiousService(String name,
                                    Integer duration,
                                    Long price,
                                    Language language) {
        super(name, Religion.BUDDHISM, duration, price);
        this.language = (Language) Util.checkIfNull(language, "language");
    }

    public void performMeditation() {
        System.out.println("This meditation will commence after short word in " + language + "from our priest");
    }
}
