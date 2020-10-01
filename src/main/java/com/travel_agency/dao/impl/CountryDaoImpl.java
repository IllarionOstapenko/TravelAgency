package com.travel_agency.dao.impl;

import com.travel_agency.dao.CountryDao;
import com.travel_agency.entity.City;
import com.travel_agency.entity.Country;
import lombok.AllArgsConstructor;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CountryDaoImpl implements CountryDao {

    private SessionFactory sessionFactory;

    @Override
    public Country getById(int id) {
        try (Session session = sessionFactory.openSession()) {

            return session.get(Country.class, id);
        }
    }

    @Override
    public List<City> getCitiesByCountryId(int id) {
        try (Session session = sessionFactory.openSession()) {
            Country country = session.get(Country.class, id);
            Hibernate.initialize(country.getCities());
            return country.getCities();
        }
    }
}
