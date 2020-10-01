package com.travel_agency.controller;

import com.travel_agency.entity.Hotel;
import com.travel_agency.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ManagementController {

    private final HotelService hotelService;

    @GetMapping("/management")
    public String managementPage() {
        return "management/management";
    }

//    @GetMapping(value = "/addHotel")
//    public String moveToAddHotelPage() {
//        return "management/add_hotel";
//    }




}
