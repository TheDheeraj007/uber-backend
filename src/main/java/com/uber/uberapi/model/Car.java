package com.uber.uberapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="car")
@Getter
@Setter
public class Car extends Auditable{

    @ManyToOne
    private Color color;

    private String plateNumber;
    private String brandAndModel;
    @Enumerated(EnumType.STRING)
    private CarType carType;

    @OneToOne
    private Driver driver;

}
