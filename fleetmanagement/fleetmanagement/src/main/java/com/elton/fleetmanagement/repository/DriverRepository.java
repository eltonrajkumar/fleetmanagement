package com.elton.fleetmanagement.repository;

import com.elton.fleetmanagement.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    // 8️⃣ Find drivers with expired license
    @Query("SELECT d FROM Driver d WHERE d.license.expiryDate < CURRENT_DATE")
    List<Driver> findDriversWithExpiredLicense();
}
