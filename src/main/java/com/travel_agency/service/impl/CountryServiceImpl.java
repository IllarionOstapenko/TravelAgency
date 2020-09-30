package com.travel_agency.service.impl;

import com.travel_agency.dao.CountryDao;
import com.travel_agency.dto.CountryDto;
import com.travel_agency.entity.City;
import com.travel_agency.entity.Country;
import com.travel_agency.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;

    @Override
    @Transactional
    public Country getById(int id) {
        return countryDao.getById(id);
    }

    @Override
    @Transactional
    public List<City> getCitiesByCountryId(int id) {
        return countryDao.getCitiesByCountryId(id);
    }


    @Override
    @Transactional
    public CountryDto getCountryDto(int countryId) {
        Country country = getById(countryId);

        return new CountryDto(country.getName(), country.getCode(), getCitiesByCountryId(countryId));
    }
}
