package com.travel_agency.service.impl;

import com.travel_agency.dao.RoomBookArchiveDao;
import com.travel_agency.entity.RoomBookArchive;
import com.travel_agency.service.RoomBookArchiveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomBookArchiveServiceImpl implements RoomBookArchiveService {

    private final RoomBookArchiveDao roomBookArchiveDao;

    @Override
    @Transactional
    public List<RoomBookArchive> getRoomBookArchiveByUserId(int id) {
        return roomBookArchiveDao.getRoomBookArchiveByUserId(id);
    }
}
