package com.travel_agency.dto;

import com.travel_agency.entity.Room;
import com.travel_agency.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomBookDto {
    private int id;
    private String orderStart;
    private String orderEnd;
    private Room room;
    private User user;
}
