package com.travel_agency.controller;

import com.travel_agency.config.Validator;
import com.travel_agency.entity.Hotel;
import com.travel_agency.entity.RoomBook;
import com.travel_agency.service.CityService;
import com.travel_agency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HotelController {
    private final HotelService hotelService;
    private final CityService cityService;
    private Validator validator = new Validator();

    @Autowired
    public HotelController(HotelService hotelService, CityService cityService) {
        this.cityService = cityService;
        this.hotelService = hotelService;
    }

    @GetMapping(value = "/hotels")
    public String getAllHotels(ModelMap model) {
        model.addAttribute("hotels", hotelService.getAll());
        return "home/findHotels";
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
            @RequestParam int hotelId, @RequestParam int roomId, String startDateAvailable, String endDateAvailable,
            ModelMap model) {
        validator.validateAvailableDate(startDateAvailable, endDateAvailable);
        System.out.println("___________________________________________________");
        System.out.println(hotelId);
        System.out.println(startDateAvailable);
        System.out.println(endDateAvailable);
        System.out.println(roomId);
        System.out.println("___________________________________________________");

        RoomBook roomBook = new RoomBook();


//        model.addAttribute(
//                "hotelDto", hotelService.bookRoomByHotelId(id,));

        return "home/hotel";
    }

    @GetMapping(value = "/addHotel")
    public String add(Model model) {
        model.addAttribute("hotel", new Hotel());
//        model.addAttribute("city",cityService.getById(id));
        System.out.println("GET");
        return "management/addHotel";
    }

    @PostMapping("/addHotel")
    public String addHotel(@ModelAttribute Hotel hotel, Model model) {
        System.out.println("POST");
        model.addAttribute("hotelDto", hotelService.add(hotel));
        return "management/management";
    }

}
