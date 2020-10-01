package com.travel_agency.service;

import com.travel_agency.entity.Room;

import java.util.List;

public interface RoomService {

    void add(Room room);

    List getRoomByHotelId(int id);

    List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId);

}
