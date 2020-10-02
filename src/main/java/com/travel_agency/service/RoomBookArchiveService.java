package com.travel_agency.service;

import com.travel_agency.entity.RoomBookArchive;

import java.util.List;

public interface RoomBookArchiveService {
    List<RoomBookArchive> getRoomBookArchiveByUserId(int id);
}
