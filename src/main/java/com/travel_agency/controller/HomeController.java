package com.travel_agency.controller;

import com.travel_agency.service.HotelService;
import com.travel_agency.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class HomeController {

    private UserService userService;

    private HotelService hotelService;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(ModelMap model) {
//        List<User> clients = userService.getAllUsers();
//        model.addAttribute("clients", clients);
        return "home/home";
    }


}


