package com.elton.fleetmanagement.service.impl;

import com.elton.fleetmanagement.entity.MaintenanceRecord;
import com.elton.fleetmanagement.repository.MaintenanceRecordRepository;
import com.elton.fleetmanagement.service.MaintenanceRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceRecordServiceImpl
        implements MaintenanceRecordService {

    private final MaintenanceRecordRepository repository;

    @Override
    public MaintenanceRecord save(MaintenanceRecord record) {
        return repository.save(record);
    }

    @Override
    public List<MaintenanceRecord> getByVehicle(Long vehicleId) {
        return repository.findByVehicleId(vehicleId);
    }
}