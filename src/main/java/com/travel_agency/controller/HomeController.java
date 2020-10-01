package com.travel_agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String homePage(ModelMap model) {
//        return "home/home";
//    }

    @GetMapping("/home")
    public String homePage(){
            return "home/home";
    }


}


