package com.elton.fleetmanagement.controller;

import com.elton.fleetmanagement.entity.Vehicle;
import com.elton.fleetmanagement.service.VehicleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor

public class VehicleController {
    private final VehicleService vehicleService;

    // CREATE
    @PostMapping
    public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
     return vehicleService.save(vehicle);
    }

    // READ (ALL)
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAll();
    }
}
