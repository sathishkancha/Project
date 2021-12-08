package com.example2.demo2.Reposityarylayer;

import com.example2.demo2.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class UserReposityaryInterfaceTest {
    @Autowired
    private UserReposityaryInterface repositry;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        User user= User.builder()

                .userName("IT")
                .userMail("sfhskafhio")
                .userMobileNumber(5456687)
                .build();
           entityManager.persist(user);
    }

    @Test
    public void findIDReturnUser(){
        String name="IT";
        User user=repositry.getById(1);
        assertEquals(user.getUserName(),name);
    }
}