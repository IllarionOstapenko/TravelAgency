package com.travel_agency.service.impl;

import com.travel_agency.dao.UserDao;
import com.travel_agency.entity.User;
import com.travel_agency.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        final User user = userDao.findUserByUsername(username);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        return userDao.findUserByUsername(username);
    }


}
