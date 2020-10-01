package com.travel_agency.service.impl;

import com.travel_agency.dao.RoomDao;
import com.travel_agency.entity.Room;
import com.travel_agency.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomDao roomDao;

    @Override
    @Transactional
    public void add(Room room) {
        roomDao.add(room);
    }

    @Override
    public List getRoomByHotelId(int id) {
        return roomDao.getRoomByHotelId(id);
    }

    @Override
    @Transactional
    public List<Room> getAvailableRoomsOnDateInHotel(String startDate, String endDate, int hotelId) {
        return roomDao.getAvailableRoomsOnDateInHotel(startDate, endDate, hotelId);
    }


}
