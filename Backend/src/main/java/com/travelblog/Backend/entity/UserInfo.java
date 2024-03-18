package com.travelblog.Backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "user_info")
public class UserInfo {

    @Id
    @Column(unique = true)
    private Long usernumber; //회원번호


    @Column private String username; //이름
    @Column(unique = true) private String useremail; //이메일
//    @Column(unique = true) private String userphonenum; //폰번호
    @Column(unique = true) private String userid; //아이디
    @Column private String userpassword; //비번
//    @Column(unique = true) private String usernickname; //닉네임

    @Column private boolean deleteyn; //탈퇴 true, 미탈퇴 false
    @Column private LocalDateTime createdat; //가입일시
//    @Column private LocalDateTime recentaccess; //최근 로그인 일시
//    @Column private LocalDateTime modifieddata; //회원정보 수정 일시

//    @Column private Integer alarm; //알림 기능 on 1 & off 0
//    @Column private Long loginnumber; //로그인 횟수[추가]

}
