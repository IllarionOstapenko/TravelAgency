package com.travel_agency.service.impl;

import com.travel_agency.dao.HotelDao;
import com.travel_agency.dto.HotelDto;
import com.travel_agency.entity.Hotel;
import com.travel_agency.service.HotelService;
import com.travel_agency.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelDao hotelDao;
    private final RoomService roomService;

    @Override
    @Transactional
    public void add(Hotel hotel) {
        hotelDao.add(hotel);
    }

    @Override
    @Transactional
    public Hotel getById(int id) {
        return hotelDao.getById(id);
    }

    @Override
    @Transactional
    public List<Hotel> getAll() {
        return hotelDao.getAll();
    }

    @Override
    @Transactional
    public List<Hotel> getHotelsByCityId(int id) {
        return hotelDao.getHotelsByCityId(id);
    }

    @Override
    @Transactional
    public HotelDto getHotelDtoById(int hotelId) {
        Hotel hotel = getById(hotelId);
        Calendar nextYearC = Calendar.getInstance();
        Calendar twoYearsAgoC = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        nextYearC.add(Calendar.YEAR, 1);
        Date nextYear = nextYearC.getTime();

        twoYearsAgoC.add(Calendar.YEAR, -2);
        Date twoYearsAgo = twoYearsAgoC.getTime();

        return new HotelDto(
                hotel.getId(),
                hotel.getName(),
                hotel.getCity().getCountry(),
                hotel.getCity(),
                dateFormat.format(new Date()),
                dateFormat.format(twoYearsAgo),
                dateFormat.format(nextYear));
    }

    @Override
    @Transactional
    public HotelDto getHotelDtoWithAvailabilityById(int hotelId, String startDate, String endDate) {
        Hotel hotel = getById(hotelId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar twoYearsAgoC = Calendar.getInstance();
        twoYearsAgoC.add(Calendar.YEAR, -2);
        Date twoYearsAgo = twoYearsAgoC.getTime();

        return new HotelDto(
                hotel.getId(),
                hotel.getName(),
                hotel.getCity().getCountry(),
                hotel.getCity(),
                dateFormat.format(new Date()),
                dateFormat.format(twoYearsAgo),
                startDate,
                endDate,
                roomService.getAvailableRoomsOnDateInHotel(startDate, endDate, hotelId));
    }


}
