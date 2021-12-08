package com.example2.demo2.Controllerpack;

import com.example2.demo2.entity.User;
import com.example2.demo2.servicelayer.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl service;
    @PostMapping ("/users")
    public User postvalues(@RequestBody User user){
     return service.postUserValues(user);

    }
    @GetMapping("/users")
    public List<User> getuser(){
        return service.getuserdeatils();
    }
    @PutMapping("/users/{id}")
    public User upadate(@PathVariable("id") int userId,@RequestBody User user ){
        return service.update(userId,user);
    }
   @GetMapping("/users/name/{name}")
    public User fetchuserByName(@PathVariable ("name") String userName){
        return service.fetchuserByName(userName);
   }
}
