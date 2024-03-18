package com.travelblog.Backend.controller;

import com.travelblog.Backend.dto.ResponseDataDto;
import com.travelblog.Backend.dto.UserJoinRequestDto;
import com.travelblog.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/join")
    public ResponseDataDto userJoin(@RequestBody UserJoinRequestDto requestDto) {
        return userService.join(requestDto);
    }
}
