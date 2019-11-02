package com.wxy.singtom;

public enum  PeopleEun {
    Test01("黑","黄");

    private String color;
    private String location;

    private PeopleEun(String color ,String location){
        this.color=color;
        this.location=location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PeopleEun{" +
                "color='" + color + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}
