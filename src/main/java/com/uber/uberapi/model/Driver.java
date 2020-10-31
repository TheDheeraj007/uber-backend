package com.uber.uberapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "driver")
public class Driver extends Auditable{

    @OneToOne
    private Account account;
    private Gender gender;
    private String name;

    @OneToOne(mappedBy = "driver")
    private Car car;

    private String driverLicenseDetails;

    @Temporal(value = TemporalType.DATE)
    private Date dob;

    @Enumerated(EnumType.STRING)
    private DriverApprovalStatus driverApprovalStatus;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;

    private Boolean isAvailable;

    private String activeCity;

    @OneToOne
    private Location lastKnownLocation;

    @OneToOne
    private Location home;
}
