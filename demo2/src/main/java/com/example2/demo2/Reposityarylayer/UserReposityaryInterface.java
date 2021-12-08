package com.example2.demo2.Reposityarylayer;

import com.example2.demo2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposityaryInterface extends JpaRepository<User,Integer>{

    User findByUserName(String userName);

    User findByUserNameIgnoreCase(String userName);
}