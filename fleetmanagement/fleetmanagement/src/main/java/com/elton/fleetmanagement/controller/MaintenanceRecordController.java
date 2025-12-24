package com.elton.fleetmanagement.controller;

import com.elton.fleetmanagement.entity.MaintenanceRecord;
import com.elton.fleetmanagement.service.MaintenanceRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenance")
@RequiredArgsConstructor
public class MaintenanceRecordController {

    private final MaintenanceRecordService service;

    // CREATE
    @PostMapping
    public MaintenanceRecord create(@RequestBody MaintenanceRecord record) {
        return service.save(record);
    }

    // QUERY: maintenance records for a vehicle
    @GetMapping("/vehicle/{vehicleId}")
    public List<MaintenanceRecord> getByVehicle(@PathVariable Long vehicleId) {
        return service.getByVehicle(vehicleId);
    }
}
