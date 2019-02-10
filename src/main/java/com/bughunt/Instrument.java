package com.bughunt;

public class Instrument {
    private Integer value;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Instrument(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
}
