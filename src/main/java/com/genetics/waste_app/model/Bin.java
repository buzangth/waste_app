package com.genetics.waste_app.model;

public class Bin {

   private String id;
   private Location location;

//    public Bin(String id, Location location) {
//        this.id = id;
//        this.location = location;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
