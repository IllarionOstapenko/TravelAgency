package com.travel_agency.dao;

import com.travel_agency.entity.Room;

import java.util.List;

public interface RoomDao {
    void add(Room room);

    List<Room> getRoomByHotelId(int id);

    Room getRoomById(int id);


    List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId);

}
