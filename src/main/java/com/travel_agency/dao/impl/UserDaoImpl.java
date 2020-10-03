package com.travel_agency.dao.impl;

import com.travel_agency.dao.UserDao;
import com.travel_agency.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public User getUserById(int id) {
        try (Session session = sessionFactory.openSession()) {

            final Object user = session.createQuery("from User u where u.id=?1 ").setParameter(1, id).uniqueResult();
            if (user == null) {
                throw new RuntimeException("There is no rooms");
            }
            return (User) user;

        }
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from User").list();
        }
    }

    @Override
    public User findUserByUsername(String username) {
        try (Session session = sessionFactory.openSession()) {
            final Object user = session.createQuery("from User where username=?1")
                    .setParameter(1, username).getSingleResult();
            if (user == null) {
                throw new RuntimeException("User not found");
            }
            return (User) user;
        }
    }

}
