package com.travel_agency.controller;

import com.travel_agency.config.Validator;
import com.travel_agency.entity.Room;
import com.travel_agency.entity.RoomBook;
import com.travel_agency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class HotelController {
    private HotelService hotelService;
    private Validator validator = new Validator();

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping(value = "/hotels")
    public String getAllHotels(ModelMap model) {
        model.addAttribute("hotels", hotelService.getAll());
        return "home/find_hotels";
    }

    @PostMapping(value = "/hotel")
    public String hotel(@RequestParam int id, ModelMap model, HttpServletRequest request) {
        if (request.getParameter("check") != null) {
            model.addAttribute("hotelDto", hotelService.getHotelDtoById(id));
            return "home/hotel";
        } else if (request.getParameter("book") != null) {
            model.addAttribute("hotelDto", hotelService.getHotelDtoById(id));
            return "home/hotel";
        }
        return null;
    }

    @PostMapping("/hotel/available")
    public String getHotelWithAvailability(
            @RequestParam int id, String startDateAvailable, String endDateAvailable, ModelMap model) {
        validator.validateAvailableDate(startDateAvailable, endDateAvailable);
        model.addAttribute(
                "hotelDto", hotelService.getHotelDtoWithAvailabilityById(id, startDateAvailable, endDateAvailable));

        return "home/hotel";
    }

    @PostMapping("/hotel/book")
    public String bookRoomByHotelId(
            @RequestParam int id,@RequestParam int number, String startDateAvailable, String endDateAvailable, ModelMap model) {
        validator.validateAvailableDate(startDateAvailable, endDateAvailable);

//        model.addAttribute(
//                "hotelDto", hotelService.bookRoomByHotelId(id,));

        return "home/hotel";
    }


//    @GetMapping(value = "/hotel")
//    public String getHotel(@RequestParam int id, ModelMap model) {
//        System.out.println("__________________________________________");
//        System.out.println(id);
//        System.out.println("__________________________________________");
//        model.addAttribute("hotelDto", hotelService.getHotelDtoById(id));
//
//        return "check_room";
//    }
}
