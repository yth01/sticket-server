package com.slci.sticket.user.api;

import com.slci.sticket.user.application.UserService;
import com.slci.sticket.user.dto.UserRequestDto;
import com.slci.sticket.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/users/{userId}")
    public UserResponseDto getUser(
            @PathVariable("userId") Long userId) {
        return userService.getUser(userId);
    }

    @PostMapping("/users")
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }
}
