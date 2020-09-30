package com.travel_agency.service.impl;

import com.travel_agency.dao.RoomBookDao;
import com.travel_agency.service.RoomBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomBookServiceImpl implements RoomBookService {

    private RoomBookDao roomBookDao;


}
