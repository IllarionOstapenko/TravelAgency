package com.travel_agency.dao.impl;

import com.travel_agency.dao.CityDao;
import com.travel_agency.entity.City;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CityDaoImpl implements CityDao {

    private final SessionFactory sessionFactory;

    @Override
    public City getById(int id) {
        try (Session session = sessionFactory.openSession()) {
            final Object city = session.createQuery("from City where id=?1")
                    .setParameter(1, id).uniqueResult();
            if (city == null) {
                throw new RuntimeException("There is not city");
            }
            return (City) city;

        }
    }

    @Override
    public List<City> getAll() {
        try (Session session = sessionFactory.openSession()) {
            final List<City> list = session.createQuery("from City", City.class).list();
            if (list == null) {
                throw new RuntimeException("There is no City");
            }
            return list;
        }
    }
}
