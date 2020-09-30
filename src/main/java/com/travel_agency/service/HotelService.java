package com.travel_agency.service;

import com.travel_agency.dto.HotelDto;
import com.travel_agency.entity.Hotel;
import com.travel_agency.entity.RoomBook;

import java.util.List;

public interface HotelService {

    Hotel getById(int id);

    List<Hotel> getAll();

    HotelDto getHotelDtoById(int hotelId);

    HotelDto getHotelDtoWithAvailabilityById(int hotelId, String startDate, String endDate);

    HotelDto bookRoomByHotelId(int hotelId, RoomBook roomBook);



}
