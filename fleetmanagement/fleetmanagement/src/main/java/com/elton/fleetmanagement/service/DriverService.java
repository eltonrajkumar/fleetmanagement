package com.elton.fleetmanagement.service;

import com.elton.fleetmanagement.entity.Driver;

import java.util.List;

public interface DriverService {

    Driver save(Driver driver);

    List<Driver> getExpiredLicenseDrivers();
}