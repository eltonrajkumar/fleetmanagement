package com.elton.fleetmanagement.controller;

import com.elton.fleetmanagement.entity.Trip;
import com.elton.fleetmanagement.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@RequiredArgsConstructor
public class TripController {

    private final TripService service;

    // CREATE
    @PostMapping
    public Trip create(@RequestBody Trip trip) {
        return service.save(trip);
    }

    // QUERY: trips by driver
    @GetMapping("/driver/{driverId}")
    public List<Trip> getByDriver(@PathVariable Long driverId) {
        return service.getByDriver(driverId);
    }

    // QUERY: trips by vehicle
    @GetMapping("/vehicle/{vehicleId}")
    public List<Trip> getByVehicle(@PathVariable Long vehicleId) {
        return service.getByVehicle(vehicleId);
    }

    // QUERY: active trips
    @GetMapping("/status/{status}")
    public List<Trip> getByStatus(@PathVariable String status) {
        return service.getByStatus(status);
    }

    // QUERY: count trips per driver
    @GetMapping("/count/{driverId}")
    public Long countTrips(@PathVariable Long driverId) {
        return service.countTripsByDriver(driverId);
    }

    // QUERY: longest trips
    @GetMapping("/longest")
    public List<Trip> longestTrips() {
        return service.getLongestTrips();
    }
}
