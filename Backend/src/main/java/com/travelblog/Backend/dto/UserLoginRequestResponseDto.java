package com.travelblog.Backend.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class UserLoginRequestResponseDto {
    private String username;
    private String useremail;
    private String userid;
    private String token;
}
