package com.genetics.waste_app.vahicle;

public class Vehicle {
    private String id,VehicleName,vehicleReg;

    private VehicleType vehicleType;

    public Vehicle(String id, String vehicleName, String vehicleReg, VehicleType vehicleType) {
        this.id = id;
        VehicleName = vehicleName;
        this.vehicleReg = vehicleReg;
        this.vehicleType = vehicleType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public void setVehicleReg(String vehicleReg) {
        this.vehicleReg = vehicleReg;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
