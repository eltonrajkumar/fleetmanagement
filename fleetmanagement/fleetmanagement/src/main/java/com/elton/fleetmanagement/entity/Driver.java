package com.elton.fleetmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data


public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "license_id")
    private License license;
    @Embedded
    private Address address;

}
//one to one