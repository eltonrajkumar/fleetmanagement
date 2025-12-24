package com.elton.fleetmanagement.entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double distance;
    private Long duration;
    @Enumerated(EnumType.STRING)
    private TripStatus status; // ONGOING / COMPLETED

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Driver driver;


}
//manytoone