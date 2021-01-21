package com.genetics.waste_app.model.vahicle;

import com.genetics.waste_app.model.Common;
import com.genetics.waste_app.model.Location;

public class Vehicle extends Common {

    public enum VehicleType{TRUCK,LORY}
    private String registration;

    private VehicleType vehicleType;
    private Location location;


    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
