package com.travelblog.Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "user_info")
public class UserInfo {


    private Long usernumber; //회원번호
    private String username; //이름
    private String useremail; //이메일
    private String userphonenum; //폰번호
    private String userid; //아이디
    private String userpassword; //비번
    private String usernickname; //닉네임




}
