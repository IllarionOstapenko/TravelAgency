package com.travel_agency.service.impl;

import com.travel_agency.dao.RoomBookArchiveDao;
import com.travel_agency.dao.RoomBookDao;
import com.travel_agency.entity.RoomBook;
import com.travel_agency.entity.RoomBookArchive;
import com.travel_agency.service.RoomBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomBookServiceImpl implements RoomBookService {

    private final RoomBookDao roomBookDao;


    @Override
    public RoomBook add(RoomBook roomBook) {
        roomBookDao.add(roomBook);
        return null;
    }

}
