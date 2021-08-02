package com.eric.userservice.controller;

import com.eric.userservice.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userName}")
    public User user(@PathVariable String userName){

        User user = new User();
        user.setId(1L);
        user.setUserCode("mockUser");
        user.setUserName(userName);

        return user;
    }
}
