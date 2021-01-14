package com.genetics.waste_app.model;

public class Bin {

    private String binNumber;
    private Location location;

    public Bin(String binNumber, Location location) {
        this.binNumber = binNumber;
        this.location = location;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
