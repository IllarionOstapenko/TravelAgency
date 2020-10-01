package com.travel_agency.controller;

import com.travel_agency.dao.RoomDao;
import com.travel_agency.entity.Hotel;
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

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@AllArgsConstructor
public class RoomController {
    private final RoomService roomService;
    private final HotelService hotelService;
    private final RoomDao roomDao;


    @GetMapping("/allHotels")
    public String getAllHotels(Model model) {
        model.addAttribute("hotels", hotelService.getAll());
        return "management/chooseHotel";
    }

    @GetMapping("/addRoom")
    public String getHotelAndRoomById(HttpServletRequest request, Model model) {
        model.addAttribute("room", new Room());
        model.addAttribute("hotels", hotelService.getAll());
        model.addAttribute("id", request.getParameter("id"));
        model.addAttribute("rooms", roomService.getRoomByHotelId(Integer.parseInt(request.getParameter("id"))));
        return "management/addRoom";
    }

    @PostMapping("addRoomByHotelId")
    public String addRoomByHotelId(@RequestParam int id, @ModelAttribute Room room, Model model) {
        roomService.add(room);
        return "/";
    }

    @GetMapping("/hotelById")
    public String getHotelById(@RequestParam int id, Model model) {
        final Hotel hotel = hotelService.getById(id);
        model.addAttribute("hotel", hotelService.getById(id));
        System.out.println(hotel.getId() + " " + hotel.getCity().getName() + " " + hotel.getName());
        return "management/addRoom";
    }


}
