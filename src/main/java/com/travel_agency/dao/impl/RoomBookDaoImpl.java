package com.travel_agency.dao.impl;

import com.travel_agency.dao.RoomBookDao;
import com.travel_agency.entity.RoomBook;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RoomBookDaoImpl implements RoomBookDao {
    private  final  SessionFactory sessionFactory;


    @Override
    public void add(RoomBook roomBook) {
        try (Session session = sessionFactory.openSession()) {
            session.persist(roomBook);
        }
    }
}
