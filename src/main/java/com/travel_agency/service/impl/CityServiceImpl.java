package com.travel_agency.service.impl;

import com.travel_agency.dao.CityDao;
import com.travel_agency.entity.City;
import com.travel_agency.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityDao cityDao;

    @Override
    public City getById(int id) {
        return cityDao.getById(id);
    }

    @Override
    public List<City> getAll() {
        return cityDao.getAll();
    }
}
