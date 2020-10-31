package com.uber.uberapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="namedLocation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NamedLocation extends Auditable{
    @OneToOne
    private Location location;

    private String name;
}
