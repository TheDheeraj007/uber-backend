package com.uber.uberapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
public class Passenger extends Auditable {

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    private String name;

    @Enumerated(value = EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY)// create fk column in booking as passenger
    private List<Booking> bookings = new ArrayList<>();

    @Temporal(value = TemporalType.DATE)
    private Date dob;

    private String phoneNumber;

    @OneToOne
    private Location home;

    @OneToOne
    private Location work;

    @OneToOne
    private Location lastKnownLocation;

}
