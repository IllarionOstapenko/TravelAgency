package com.travel_agency.dao;

import com.travel_agency.entity.Room;

import java.util.List;

public interface RoomDao {

    List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId);

    int getRoomIdByHotelIdAndRoomNumber(int hotelId, int roomNumber);
}
