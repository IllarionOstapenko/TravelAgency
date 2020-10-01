package com.travel_agency.dao.impl;

import com.travel_agency.dao.HotelDao;
import com.travel_agency.entity.Hotel;
import com.travel_agency.entity.RoomBook;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class HotelDaoImpl implements HotelDao {
    private final SessionFactory sessionFactory;


    @Override
    public void add(Hotel hotel) {
        try (Session session = sessionFactory.openSession()) {
            session.persist(hotel);
        }
    }

    @Override
    public Hotel getById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Hotel hotel = session.get(Hotel.class, id);

            if (hotel == null) {
                throw new RuntimeException("Hotel Id is not correct");
            } else {
                return hotel;
            }
        }
    }

    @Override
    public List<Hotel> getAll() {
        try (Session session = sessionFactory.openSession()) {
            List<Hotel> hotels = session.createQuery("FROM Hotel", Hotel.class).list();

            if (hotels == null) {
                throw new RuntimeException("Hotel not found");
            } else {
                return hotels;
            }
        }
    }

    @Override
    public Hotel bookRoomByHotelId(int hotelId, RoomBook roomBook) {

        try (Session session = sessionFactory.openSession()) {
        }
        return null;
    }
}
