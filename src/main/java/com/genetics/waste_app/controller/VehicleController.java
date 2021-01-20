package com.genetics.waste_app.controller;


import com.genetics.waste_app.model.Bin;
import com.genetics.waste_app.model.person.Person;
import com.genetics.waste_app.model.vahicle.Vehicle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    List<Vehicle> addVehicle = new ArrayList<>();

    @PostMapping(path = "/createVehicle")
    public ResponseEntity<?> newVehicle(@Valid @RequestBody Vehicle vehicle){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setId(vehicle.getId());
        vehicle1.setName(vehicle.getName());
        vehicle1.setLocation(vehicle.getLocation());
        vehicle1.setRegistration(vehicle.getRegistration());
        vehicle1.setVehicleType(vehicle.getVehicleType());
        addVehicle.add(vehicle1);

        return new ResponseEntity<Vehicle>(vehicle1, HttpStatus.OK);
    }

    @GetMapping(value="/getVehicleById/{id}")
    public Vehicle getVehicleById(@PathVariable("id") String id){

        return addVehicle.stream().filter(vehicle -> id.equals(vehicle.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("vehicle " + id + "doesn't exist"));

    }

    @DeleteMapping(value="/deleteVehicle.ById/{id}")
    public void deleteById(@PathVariable("id") String id) throws Exception{

        addVehicle.removeIf(vehicle -> id.equals(vehicle.getId()));
    }

    @GetMapping(value = "/all")
    public  Iterable<Vehicle> allVehicle() throws Exception {
        return addVehicle;
    }
}