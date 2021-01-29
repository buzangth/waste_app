package com.genetics.waste_app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("bin")
public class Bin {

   private String id;
   private Location location;


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
