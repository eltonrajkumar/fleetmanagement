package com.elton.fleetmanagement.service.impl;

import com.elton.fleetmanagement.entity.Driver;
import com.elton.fleetmanagement.repository.DriverRepository;
import com.elton.fleetmanagement.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepository repository;

    @Override
    public Driver save(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public List<Driver> getExpiredLicenseDrivers() {
        return repository.findDriversWithExpiredLicense();
    }
}
