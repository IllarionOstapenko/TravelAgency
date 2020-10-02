package com.travel_agency.dao;

import com.travel_agency.entity.City;

import java.util.List;

public interface CityDao {

    City getById(int id);

    List<City> getAll();
}
