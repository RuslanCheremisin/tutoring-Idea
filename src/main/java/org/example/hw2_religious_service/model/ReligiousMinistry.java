package org.example.hw2_religious_service.model;

import org.example.util.Util;

public class ReligiousMinistry {
    private String name;
    private Religion religion;
    private Integer duration;
    private Long price;
    public ReligiousMinistry(String name,
                             Religion religion,
                             Integer duration,
                             Long price) {
        this.name = (String) Util.checkIfNull(name, "name");
        this.religion = (Religion) Util.checkIfNull(religion, "religion");
        Util.checkIfNull(duration, "duration");
        if (duration <= 0) {
            throw new IllegalArgumentException("duration can not to zero or less");
        }
        this.duration = duration;
        Util.checkIfNull(price, "price");
        if (price < 0) {
            throw new IllegalArgumentException("price can not be less than zero");
        }
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = (String) Util.checkIfNull(name, "name");
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = (Religion) Util.checkIfNull(religion, "religion");
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        Util.checkIfNull(duration, "duration");
        if (duration <= 0) {
            throw new IllegalArgumentException("duration can not be equals to zero or less");
        }
        this.duration = duration;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        Util.checkIfNull(price, "price");
        if (price < 0) {
            throw new IllegalArgumentException("price can not be less than zero");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReligiousService{" +
                "name='" + name + '\'' +
                ", religion=" + religion +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
