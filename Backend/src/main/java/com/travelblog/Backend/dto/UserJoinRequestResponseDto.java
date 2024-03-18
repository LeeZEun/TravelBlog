package com.travelblog.Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class UserJoinRequestResponseDto {
    private Long usernumber; //회원번호
    private String username; //이름
    private String useremail; //이메일
    private String userid; //아이디
    private String userpassword; //비번
    private LocalDateTime createdat; //가입일시
}
