package com.travel_agency.dao;

import com.travel_agency.entity.Room;

import java.util.List;

public interface RoomDao {
    void add(Room room);

    List getRoomByHotelId(int id);

    Room getRoomByRoomNumber(int roomNumber);

    List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId);

//    int getRoomIdByHotelIdAndRoomNumber(int hotelId, int roomNumber);
}
