package com.travelblog.Backend.dto;

import com.travelblog.Backend.entity.UserInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDto {
    private String userid;
    private String userpassword;

    public UserInfo toEntity() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid(this.userid);
        userInfo.setUserpassword(this.userpassword);
        return userInfo;
    }
}
