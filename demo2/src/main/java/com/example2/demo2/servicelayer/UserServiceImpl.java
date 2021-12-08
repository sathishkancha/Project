package com.example2.demo2.servicelayer;

import com.example2.demo2.Reposityarylayer.UserReposityaryInterface;
import com.example2.demo2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceInterface{

@Autowired
private UserReposityaryInterface repositry;
    @Override
    public User postUserValues(User user) {
        return repositry.save(user);
    }

    public List<User> getuserdeatils(){
        return repositry.findAll();

    }


    public User update(int userId, User user) {
        User db= repositry.getById(userId);
        if(user.getUserName() !=null){
            db.setUserName(user.getUserName());

        }
        return db;
    }

    @Override
    public User fetchuserByName(String userName) {
        return repositry.findByUserNameIgnoreCase(userName);
    }
}
