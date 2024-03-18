package com.travelblog.Backend.service;

import com.travelblog.Backend.dto.ResponseDataDto;
import com.travelblog.Backend.dto.UserJoinRequestDto;
import com.travelblog.Backend.dto.UserJoinRequestResponseDto;
import com.travelblog.Backend.entity.UserInfo;
import com.travelblog.Backend.repository.UserRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseDataDto<UserJoinRequestResponseDto> join(UserJoinRequestDto users) {
        Optional<UserInfo> optUserId = userRepository.findById(users.getUserid());
        Optional<UserInfo> optUserEmail = userRepository.findByEmail(users.getUseremail());
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
}
