package com.uber.uberapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "booking")
public class Booking extends Auditable {

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private BookingType bookingType;

    @OneToOne
    private Review reviewByUser;

    @OneToOne
    private OTP rideStartOTP;

    @OneToOne
    private Review reviewByDriver;

    @Enumerated
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    @OneToMany
    private List<Location> route = new ArrayList<>();

}
