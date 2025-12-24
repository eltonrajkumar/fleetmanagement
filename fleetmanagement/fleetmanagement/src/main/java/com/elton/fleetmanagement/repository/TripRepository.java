package com.elton.fleetmanagement.repository;

import com.elton.fleetmanagement.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {

    // 2️⃣ Find trips assigned to a driver
    List<Trip> findByDriverId(Long driverId);

    // 3️⃣ Find trips using a specific vehicle
    List<Trip> findByVehicleId(Long vehicleId);

    // 5️⃣ Find active trips
    List<Trip> findByStatus(String status);

    // 6️⃣ Count trips per driver
    @Query("SELECT COUNT(t) FROM Trip t WHERE t.driver.id = :driverId")
    Long countTripsByDriver(Long driverId);

    // 9️⃣ Find longest trips
    List<Trip> findTop5ByOrderByDistanceDesc();
}
