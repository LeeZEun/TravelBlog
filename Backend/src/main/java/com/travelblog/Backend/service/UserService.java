package com.travelblog.Backend.service;

import com.travelblog.Backend.dto.*;
import com.travelblog.Backend.entity.UserInfo;
import com.travelblog.Backend.repository.UserRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    private TokenProvider tokenProvider;

    //회원가입
    public ResponseDataDto<UserJoinRequestResponseDto> join(UserJoinRequestDto users) {
        Optional<UserInfo> optUserId = userRepository.findByUserid(users.getUserid());
        Optional<UserInfo> optUserEmail = userRepository.findByUseremail(users.getUseremail());
        System.out.println(users.getUsername());

        //id와 email 모두 일치하는 항목이 없을 경우 회원가입 성공
        if(optUserId.isEmpty() && optUserEmail.isEmpty()) {
            UserInfo userEntity = users.toEntity();
            System.out.println(userEntity.getUsername());
            userEntity.setCreatedat(LocalDateTime.now()); // 가입일시

            userRepository.save(userEntity);

            return new ResponseDataDto("Join Successfully", 200, new UserJoinRequestResponseDto(optUserEmail.get().getUsernumber(), optUserEmail.get().getUsername(), optUserEmail.get().getUseremail(), optUserEmail.get().getUserid(), optUserEmail.get().getUserpassword(), optUserEmail.get().getCreatedat()));
        }
        else { //회원가입 실패
            return new ResponseDataDto("Fail to Join", 406, null);
        }
    }

    //로그인
    public ResponseDataDto<UserLoginRequestResponseDto> login(UserLoginRequestDto users) {
        Optional<UserInfo> optionalUserInfo = userRepository.findByUserid(users.getUserid());
        UserLoginRequestResponseDto userLoginRequestResponseDto = null;

        if(optionalUserInfo.isPresent()) { //아이디 있으면
            UserInfo userInfo = optionalUserInfo.get();

            if(userInfo.getUserpassword().equals(users.getUserpassword())) { //로그인 성공
//                final String token = tokenProvider.create(optionalUserInfo.get());
                ///////
                final String token = "7979dfds29";

                System.out.println(userInfo.toString());
                return new ResponseDataDto("Login Success", 200, new UserLoginRequestResponseDto(optionalUserInfo.get().getUsername(), optionalUserInfo.get().getUseremail(), optionalUserInfo.get().getUserid(), token));
            }
            else { //비밀번호 틀림
                return new ResponseDataDto("Password is Wrong", 406, null);
            }
        }
        else {
            return new ResponseDataDto("Email is not found Success", 406, null);
        }
    }
}
