package com.travel_agency.dto;

import com.travel_agency.entity.City;
import com.travel_agency.entity.Country;
import com.travel_agency.entity.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HotelDto {

    private int hotelId;
    private String hotelName;
    private Country country;
    private City city;
    private String currentDate;
    private String minDate;
    private String maxDate;
    private String startDate;
    private String endDate;
    private List<Room> availableRooms;
    private Integer countOfClient;
    private Integer averageBookTime;
    private List<int[]> roomLoading;

    public HotelDto(
            int hotelId,
            String hotelName,
            Country country,
            City city,
            String currentDate,
            String minDate,
            String maxDate) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.country = country;
        this.city = city;
        this.currentDate = currentDate;
        this.minDate = minDate;
        this.maxDate = maxDate;
    }

    public HotelDto(
            int hotelId,
            String hotelName,
            Country country,
            City city,
            String currentDate,
            String minDate,
            String startDate,
            String endDate,
            List<Room> availableRooms) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.country = country;
        this.city = city;
        this.currentDate = currentDate;
        this.minDate = minDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.availableRooms = availableRooms;
    }

}

