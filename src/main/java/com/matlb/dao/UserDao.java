package com.matlb.dao;

/**
 * Created by prassingh on 3/21/16.
 */

import com.matlb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer>{

    User findByEmailId(String email);
    User findByPhoneNumber(Long phoneNumber);
    User findByEmailIdAndAuthToken(String email , String token);
    List<User> findByPhoneNumberIn(List<Long> phoneNumberList);
}
