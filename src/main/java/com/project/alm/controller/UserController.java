package com.project.alm.controller;

import com.project.alm.dto.UserLoginRequest;
import com.project.alm.entity.Stories;
import com.project.alm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alm")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String UserLogin(@RequestBody UserLoginRequest userLoginRequest){
        return userService.getLoginResponse(userLoginRequest);
    }

    @GetMapping("/{userid}")
    public String UserProfile(@PathVariable String userid){
        return userService.getUserProfile(userid);
    }
    @GetMapping("/getStory{userid}")
    public Stories getStoriesFromUserID(@PathVariable String userid){
        return userService.getStoriesFromUserID(userid);
    }

}