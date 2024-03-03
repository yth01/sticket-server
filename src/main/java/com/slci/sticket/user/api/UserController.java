package com.slci.sticket.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user2")
    public String getUser2() {
        return "user2";
    }
}
