package com.travel_agency.service;

import com.travel_agency.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId);

}
