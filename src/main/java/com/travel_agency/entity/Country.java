package com.travel_agency.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "country_name", unique = true, nullable = false, length = 30)
    private String name;

    @Column(name = "country_code", unique = true, nullable = false, length = 30)
    private String code;

    @OneToMany(mappedBy = "country")
    private List<City> cities = new ArrayList<>();

    @ManyToMany(mappedBy = "countries")
    private List<User> visitors = new ArrayList<>();
}
