package com.genetics.waste_app.vahicle;

public class VehicleType {

    private String id,vihicle;

    public VehicleType(String id, String vihicle) {
        this.id = id;
        this.vihicle = vihicle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVihicle() {
        return vihicle;
    }

    public void setVihicle(String vihicle) {
        this.vihicle = vihicle;
    }
}
