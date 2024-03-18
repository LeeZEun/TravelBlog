package com.travelblog.Backend.dto;

import com.travelblog.Backend.entity.UserInfo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserJoinRequestDto {

    private Long usernumber; //회원번호


    private String username; //이름
    private String useremail; //이메일
//    private String userphonenum; //폰번호
    private String userid; //아이디
    private String userpassword; //비번
//    private String usernickname; //닉네임

    private boolean deleteyn; //탈퇴 true, 미탈퇴 false
    private LocalDateTime createdat; //가입일시
//    private LocalDateTime recentaccess; //최근 로그인 일시
//    private LocalDateTime modifieddata; //회원정보 수정 일시

//    private Integer alarm; //알림 기능 on 1 & off 0
//    private Long loginnum; //로그인 횟수[추가]

    public UserInfo toEntity() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsernumber(this.usernumber);

        userInfo.setUsername(this.username);
        userInfo.setUseremail(this.useremail);
        userInfo.setUserid(this.userid);
        userInfo.setUserpassword(this.userpassword);

        userInfo.setCreatedat(this.createdat);

        return userInfo;
    }

}
