package com.travel_agency.controller;

import com.travel_agency.service.RoomBookArchiveService;
import com.travel_agency.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoomBookArchiveService roomBookArchiveService;

    @GetMapping("/allUsers")
    public String getAllUsers(HttpServletRequest request, Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("id", request.getParameter("id"));
        return "management/users";
    }

    @GetMapping("/info")
    public String info(@RequestParam int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("rooms", roomBookArchiveService.getRoomBookArchiveByUserId(id));
        return "management/user";
    }
}
