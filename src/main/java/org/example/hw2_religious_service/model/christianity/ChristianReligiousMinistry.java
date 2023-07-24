package org.example.hw2_religious_service.model.christianity;

import org.example.hw2_religious_service.model.Religion;
import org.example.hw2_religious_service.model.ReligiousMinistry;
import org.example.util.Util;

public class ChristianReligiousMinistry extends ReligiousMinistry {
    private Denomination denomination;

    public ChristianReligiousMinistry(String name,
                                      Integer duration,
                                      Long price,
                                      Denomination denomination) {
        super(name, Religion.CHRISTIANITY, duration, price);
        this.denomination = (Denomination) Util.checkIfNull(denomination, "denomination");
    }

    public Denomination getDenomination() {
        return denomination;
    }
    public void setDenomination(Denomination denomination) {
        this.denomination = (Denomination) Util.checkIfNull(denomination, "denomination");
    }


}
