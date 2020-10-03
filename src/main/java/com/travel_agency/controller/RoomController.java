package com.travel_agency.controller;

import com.travel_agency.entity.Room;
import com.travel_agency.service.HotelService;
import com.travel_agency.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class RoomController {

    private final RoomService roomService;
    private final HotelService hotelService;

    @GetMapping("/allHotels")
    public String getAllHotels(Model model) {
        model.addAttribute("hotels", hotelService.getAll());
        return "management/chooseHotel";
    }

    @GetMapping("/chooseHotel")
    public String getHotelAndRoomById(@RequestParam int id, Model model) {
        model.addAttribute("room", new Room());
        model.addAttribute("id", id);
        model.addAttribute("rooms", roomService.getRoomsByHotelId(id));
        return "management/addRoom";
    }

    @PostMapping("addRoomByHotelId")
    public String addRoomByHotelId(@RequestParam int id, @ModelAttribute Room room, Model model) {
        final List<Room> roomsByHotelId = roomService.getRoomsByHotelId(id);
        if (roomsByHotelId.stream().noneMatch(r -> r.getNumber() == room.getNumber())) {
            room.setHotel(hotelService.getById(id));
            roomService.add(room);
            return "index";
        }
        model.addAttribute("msg", "Room already exist");
        model.addAttribute("rm", "Add another room");
        return "modules/error";
    }

}
