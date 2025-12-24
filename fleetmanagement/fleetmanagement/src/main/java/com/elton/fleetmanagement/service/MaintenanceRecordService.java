package com.elton.fleetmanagement.service;

import com.elton.fleetmanagement.entity.MaintenanceRecord;

import java.util.List;

public interface MaintenanceRecordService {

    MaintenanceRecord save(MaintenanceRecord record);

    List<MaintenanceRecord> getByVehicle(Long vehicleId);
}