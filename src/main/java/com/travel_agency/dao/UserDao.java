package com.travel_agency.dao;

import com.travel_agency.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User loadUserByUsername();


}
