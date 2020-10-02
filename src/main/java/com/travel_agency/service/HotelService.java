package com.travel_agency.service;

import com.travel_agency.dto.HotelDto;
import com.travel_agency.entity.Hotel;

import java.util.List;

public interface HotelService {

    void add(Hotel hotel);

    Hotel getById(int id);

    List<Hotel> getAll();

    List<Hotel> getHotelsByCityId(int id);

    HotelDto getHotelDtoById(int hotelId);

    HotelDto getHotelDtoWithAvailabilityById(int hotelId, String startDate, String endDate);


}
