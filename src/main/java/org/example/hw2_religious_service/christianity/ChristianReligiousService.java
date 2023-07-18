package org.example.hw2_religious_service.christianity;

import org.example.hw2_religious_service.Religion;
import org.example.hw2_religious_service.ReligiousService;
import org.example.util.Util;

public class ChristianReligiousService extends ReligiousService {
    private Denomination denomination;

    public ChristianReligiousService(String name,
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

    public void performBaptism() {
        System.out.println("In the name of Father, Son and Holy Spirit, you will be baptised at this " + denomination + " church");
    }
}
