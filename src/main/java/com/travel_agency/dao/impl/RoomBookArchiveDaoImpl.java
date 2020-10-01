package com.travel_agency.dao.impl;

import com.travel_agency.dao.RoomBookArchiveDao;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class RoomBookArchiveDaoImpl implements RoomBookArchiveDao {

    private final SessionFactory sessionFactory;

    @Override
    public List getRoomBookArchiveByUserId(int id) {
        try (Session session = sessionFactory.openSession()) {
            final List list = session.createQuery("SELECT u FROM RoomBookArchive u where u.user.id =?1").setParameter(1, id).list();
            if (list == null) {
                throw new RuntimeException("There is no rooms");
            } else {
                return  list;
            }
        }
    }
}
