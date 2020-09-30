package com.travel_agency.service;

import com.travel_agency.dto.CountryDto;
import com.travel_agency.entity.City;
import com.travel_agency.entity.Country;

import java.util.List;

public interface CountryService {

    Country getById(int id);

    List<City> getCitiesByCountryId(int id);

    CountryDto getCountryDto(int countryId);
}
