package com.travel_agency.controller;

import com.travel_agency.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class MainController {

    private final UserService userService;


    @GetMapping("/")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    //        @GetMapping("login")
//    public String getUserByUsername(String username) {
//        final User userDetails = (User) userService.loadUserByUsername(username);
//        System.out.println(userDetails.getUsername() + " " + userDetails.getPassword());
//
//        return "login";
//    }
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        String errorMessge = null;
        if (error != null) {
            errorMessge = "Username or Password is incorrect !!";
        }
        if (logout != null) {
            errorMessge = "You have been successfully logged out !!";
        }
        model.addAttribute("errorMessge", errorMessge);
        return "login";
    }

    @GetMapping("/user")
    public String getUserByUsername(@RequestParam String username) {
        final String byUsername = userService.findByUsername(username);
        System.out.println(byUsername.toString());
        return "";
    }
}
