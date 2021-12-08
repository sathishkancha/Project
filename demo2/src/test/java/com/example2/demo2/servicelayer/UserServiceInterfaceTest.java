package com.example2.demo2.servicelayer;

import com.example2.demo2.Reposityarylayer.UserReposityaryInterface;
import com.example2.demo2.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceInterfaceTest {
    @Autowired
    private UserServiceImpl service;
    @MockBean
    private UserReposityaryInterface repositry;


    @BeforeEach
    void setUp() {
        User user= User.builder()
                .userId(1)
                .userName("IT")
                .userMail("sfhskafhio")
                .userMobileNumber(5456687)

                .build();
        Mockito.when(repositry.findByUserNameIgnoreCase("IT")).thenReturn(user);
    }
    @Test
   public void whenValidUserName_theUserShouldFound(){
        String userName="IT";
       User found=service.fetchuserByName( userName);
       assertEquals(userName,found.getUserName());

   }
}