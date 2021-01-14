package com.genetics.waste_app.model;

public class Depo {

    private String id,depoName;
    private Location location;

    public Depo(String id, String depoName, Location location) {
        this.id = id;
        this.depoName = depoName;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepoName() {
        return depoName;
    }

    public void setDepoName(String depoName) {
        this.depoName = depoName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
