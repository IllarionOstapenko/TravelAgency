package com.travel_agency.service.impl;

import com.travel_agency.dao.RoomBookDao;
import com.travel_agency.entity.RoomBook;
import com.travel_agency.service.RoomBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class RoomBookServiceImpl implements RoomBookService {

    private final RoomBookDao roomBookDao;

    @Override
    @Transactional
    public void add(RoomBook roomBook) {
        roomBookDao.add(roomBook);
    }

}
