package com.genetics.waste_app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Depo")
public class Depo extends Common {


    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
