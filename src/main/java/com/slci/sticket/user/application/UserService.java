package com.slci.sticket.user.application;

import com.slci.sticket.user.dao.UserRepository;
import com.slci.sticket.user.domain.User;
import com.slci.sticket.user.dto.UserRequestDto;
import com.slci.sticket.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto getUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return UserResponseDto.of(user);
    }

    public Map<String, String> createUser(UserRequestDto userRequestDto) {
        userRepository.save(
            User.builder()
                    .name(userRequestDto.getName())
                    .build()
        );
        return Collections.singletonMap("message", "유저가 저장되었습니다.");
    }
}
