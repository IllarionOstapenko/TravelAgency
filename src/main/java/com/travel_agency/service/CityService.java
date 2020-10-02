package com.travel_agency.service;

import com.travel_agency.entity.City;

import java.util.List;

public interface CityService {

    City getById(int id);

    List<City> getAll();
}
