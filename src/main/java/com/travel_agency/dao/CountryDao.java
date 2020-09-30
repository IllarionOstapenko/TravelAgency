package com.travel_agency.dao;

import com.travel_agency.entity.City;
import com.travel_agency.entity.Country;

import java.util.List;

public interface CountryDao {
    Country getById(int id);

    List<City> getCitiesByCountryId(int id);
}
