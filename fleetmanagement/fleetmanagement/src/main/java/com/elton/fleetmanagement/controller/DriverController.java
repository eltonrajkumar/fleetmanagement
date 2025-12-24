package com.elton.fleetmanagement.controller;

import com.elton.fleetmanagement.entity.Driver;
import com.elton.fleetmanagement.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService service;

    // CREATE
    @PostMapping
    public Driver create(@RequestBody Driver driver) {
        return service.save(driver);
    }

    // QUERY: expired licenses
    @GetMapping("/expired")
    public List<Driver> getExpiredLicenses() {
        return service.getExpiredLicenseDrivers();
    }
}
