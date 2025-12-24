package com.elton.fleetmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class License {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String licenseNumber;
private LocalDate expiryDate;

}
