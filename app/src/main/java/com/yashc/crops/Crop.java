package com.yashc.crops;

public class Crop {

    private String name;
    private String growMethod;

    public Crop(String name, String growMethod) {
        this.name = name;
        this.growMethod = growMethod;
    }

    public String getName() {
        return name;
    }

    public String getGrowMethod() {
        return growMethod;
    }
}
