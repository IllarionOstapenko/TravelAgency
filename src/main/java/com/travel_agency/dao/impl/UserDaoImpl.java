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
    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from User").list();
        }
    }

    @Override
    public User loadUserByUsername() {
        try(Session session = sessionFactory.openSession()) {
            return (User) session.createQuery("from User where username = ?");
        }
    }
}
