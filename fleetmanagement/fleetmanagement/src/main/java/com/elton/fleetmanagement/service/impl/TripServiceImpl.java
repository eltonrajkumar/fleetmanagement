package com.elton.fleetmanagement.service.impl;

import com.elton.fleetmanagement.entity.Trip;
import com.elton.fleetmanagement.repository.TripRepository;
import com.elton.fleetmanagement.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    private final TripRepository repository;

    @Override
    public Trip save(Trip trip) {
        return repository.save(trip);
    }

    @Override
    public List<Trip> getByDriver(Long driverId) {
        return repository.findByDriverId(driverId);
    }

    @Override
    public List<Trip> getByVehicle(Long vehicleId) {
        return repository.findByVehicleId(vehicleId);
    }

    @Override
    public List<Trip> getByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public Long countTripsByDriver(Long driverId) {
        return repository.countTripsByDriver(driverId);
    }

    @Override
    public List<Trip> getLongestTrips() {
        return repository.findTop5ByOrderByDistanceDesc();
    }
}
