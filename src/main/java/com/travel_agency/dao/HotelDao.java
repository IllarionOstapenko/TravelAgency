package com.travel_agency.dao;

import com.travel_agency.entity.Hotel;

import java.util.List;

public interface HotelDao {

    void add(Hotel hotel);

    Hotel getById(int id);

    List<Hotel> getAll();

    List<Hotel> getHotelsByCityId(int id);


}
