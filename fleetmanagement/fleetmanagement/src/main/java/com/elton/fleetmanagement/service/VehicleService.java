package com.elton.fleetmanagement.service;
import com.elton.fleetmanagement.entity.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);
    List<Vehicle> getAll();

}
