package com.slci.sticket.user.application;

import com.slci.sticket.user.dao.UserRepository;
import com.slci.sticket.user.domain.User;
import com.slci.sticket.user.dto.UserRequestDto;
import com.slci.sticket.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto getUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return UserResponseDto.of(user);
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = userRepository.save(
            User.builder()
                    .name(userRequestDto.getName())
                    .build()
        );
        return UserResponseDto.of(user);
    }
}
