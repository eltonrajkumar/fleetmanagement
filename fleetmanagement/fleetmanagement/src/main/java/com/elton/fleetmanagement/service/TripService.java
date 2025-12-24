package com.elton.fleetmanagement.service;

import com.elton.fleetmanagement.entity.Trip;

import java.util.List;

public interface TripService {

    Trip save(Trip trip);

    List<Trip> getByDriver(Long driverId);

    List<Trip> getByVehicle(Long vehicleId);

    List<Trip> getByStatus(String status);

    Long countTripsByDriver(Long driverId);

    List<Trip> getLongestTrips();
}