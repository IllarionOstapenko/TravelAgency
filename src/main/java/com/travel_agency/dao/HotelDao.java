package com.travel_agency.dao;

import com.travel_agency.entity.Hotel;
import com.travel_agency.entity.RoomBook;

import java.util.List;

public interface HotelDao {

    Hotel getById(int id);

    List<Hotel> getAll();

    Hotel bookRoomByHotelId(int hotelId, RoomBook roomBook);

}
