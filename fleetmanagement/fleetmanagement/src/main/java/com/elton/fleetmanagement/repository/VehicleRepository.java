package com.elton.fleetmanagement.repository;
import com.elton.fleetmanagement.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT t.vehicle FROM Trip t GROUP BY t.vehicle ORDER BY COUNT(t) DESC")
    List<Vehicle> findVehiclesWithMostTrips();
}
