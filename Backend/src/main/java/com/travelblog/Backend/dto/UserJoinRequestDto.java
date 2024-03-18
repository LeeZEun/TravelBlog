package com.travelblog.Backend.dto;

import com.travelblog.Backend.entity.UserInfo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserJoinRequestDto {
    private String username; //이름
    private String useremail; //이메일
    private String userid; //아이디
    private String userpassword; //비번

    public UserInfo toEntity() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(this.username);
        userInfo.setUseremail(this.useremail);
        userInfo.setUserid(this.userid);
        userInfo.setUserpassword(this.userpassword);
        return userInfo;
    }

}
