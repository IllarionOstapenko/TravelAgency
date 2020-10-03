package com.travel_agency.controller;

import com.travel_agency.config.Validator;
import com.travel_agency.entity.Hotel;
import com.travel_agency.entity.RoomBook;
import com.travel_agency.service.CityService;
import com.travel_agency.service.HotelService;
import com.travel_agency.service.RoomBookService;
import com.travel_agency.service.RoomService;
import com.travel_agency.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@AllArgsConstructor
public class HotelController {

    private final HotelService hotelService;
    private final CityService cityService;
    private final RoomService roomService;
    private final RoomBookService roomBookService;
    private final UserService userService;

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

    @GetMapping("/hotel/available")
    public String getHotelWithAvailability(
            @RequestParam int id, String startDateAvailable, String endDateAvailable, ModelMap model) {
        Validator.validateAvailableDate(startDateAvailable, endDateAvailable);
        model.addAttribute(
                "hotelDto",
                hotelService.getHotelDtoWithAvailabilityById(id, startDateAvailable, endDateAvailable));
        return "home/hotel";
    }

    @PostMapping("hotel/book")
    public String bookRoomByHotelId(@RequestParam int roomId,
                                    String startDateAvailable,
                                    String endDateAvailable) {
        Validator.validateAvailableDate(startDateAvailable, endDateAvailable);
        final RoomBook roomBook = new RoomBook();
//        set userID=1,because of security and can't get logIn userDetails to get Id which need to set
        roomBook.setUser(userService.getUserById(1));
        roomBook.setRoom(roomService.getRoomById(roomId));
        roomBook.setOrderStart(startDateAvailable);
        roomBook.setOrderEnd(endDateAvailable);
        roomBookService.add(roomBook);
        return "index";
    }

    @GetMapping(value = "allCities")
    public String getAllCities(Model model) {
        model.addAttribute("cities", cityService.getAll());
        return "management/chooseCity";
    }

    @GetMapping("chooseCity")
    public String addHotel(@RequestParam int id, Model model) {
        model.addAttribute("hotel", new Hotel());
        model.addAttribute("id", id);
        model.addAttribute("city", cityService.getById(id));
        return "management/addHotel";
    }

    @PostMapping("addHotelByCityId")
    public String addHotelByCityId(@RequestParam int id, @ModelAttribute Hotel hotel, Model model) {
        final List<Hotel> hotelsByCityId = hotelService.getHotelsByCityId(id);
        if (hotelsByCityId.stream().noneMatch(r -> hotel.getName().equals(r.getName()))) {
            hotel.setCity(cityService.getById(id));
            hotelService.add(hotel);
            return "index";
        }
        model.addAttribute("msg", "Hotel with this name already exist in this City");
        model.addAttribute("rm", "Add another Hotel");
        return "modules/error";
    }

}
