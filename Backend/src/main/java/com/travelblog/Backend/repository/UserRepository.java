package com.travelblog.Backend.repository;

import com.travelblog.Backend.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findById(String userId);
    Optional<UserInfo> findByEmail(String useremail);

    List<UserInfo> findAll();
}
