package com.travel_agency.dao;

import com.travel_agency.entity.User;

import java.util.List;

public interface UserDao {

    User getUserById(int id);

    List<User> getAllUsers();

    User findUserByUsername(String username);


}
