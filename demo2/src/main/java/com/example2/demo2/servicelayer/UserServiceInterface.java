package com.example2.demo2.servicelayer;

import com.example2.demo2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserServiceInterface {
    public User postUserValues(User user);

    public List<User> getuserdeatils();
    public User update(int userId, User user);

    User fetchuserByName(String userName);
}
