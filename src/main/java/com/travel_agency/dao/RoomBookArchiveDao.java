package com.travel_agency.dao;

import com.travel_agency.entity.RoomBookArchive;

import java.util.List;

public interface RoomBookArchiveDao {

    List<RoomBookArchive> getRoomBookArchiveByUserId(int id);
}
