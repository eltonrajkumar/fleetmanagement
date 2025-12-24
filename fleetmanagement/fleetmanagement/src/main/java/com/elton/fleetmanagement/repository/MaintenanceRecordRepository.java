package com.elton.fleetmanagement.repository;

import com.elton.fleetmanagement.entity.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaintenanceRecordRepository
        extends JpaRepository<MaintenanceRecord, Long> {



    List<MaintenanceRecord> findByVehicleId(Long vehicleId);
}
