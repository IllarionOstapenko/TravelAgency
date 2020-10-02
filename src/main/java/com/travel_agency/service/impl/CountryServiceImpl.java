package com.travel_agency.service.impl;

import com.travel_agency.dao.CountryDao;
import com.travel_agency.entity.Country;
import com.travel_agency.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;

    @Override
    @Transactional
    public Country getById(int id) {
        return countryDao.getById(id);
    }
}
