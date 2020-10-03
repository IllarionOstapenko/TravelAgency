package com.travel_agency.dto;

import com.travel_agency.entity.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CountryDto {

    private String name;
    private String code;
    private List<City> cities;

}
