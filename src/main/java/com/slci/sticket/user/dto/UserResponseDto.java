package com.slci.sticket.user.dto;

import com.slci.sticket.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private Long id;
    private String name;

    public static UserResponseDto of(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }
}
