package com.lolo.app.rest.Controller;

import com.lolo.app.rest.Repo.userRepo;
import com.lolo.app.rest.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private userRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
       return "welcome";
    }

    @GetMapping(value = "/users")
    public List<user> getUser(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser( @RequestBody  user User){
        userRepo.save(User);
        return "Saved...";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser( @PathVariable long id, @RequestBody user User){
        user updatedUser = userRepo.findById(id).get();
        updatedUser.setID(id);
        updatedUser.setName(User.getName());
        updatedUser.setSurname(User.getSurname());
        updatedUser.setAge(User.getAge());
        updatedUser.setOccupation(User.getOccupation());
        userRepo.save(updatedUser);
        return "Updated";

    }

    @DeleteMapping(value = "/delete/{id}")
        public String deleteUser(@PathVariable long id){
            user deletedUser = userRepo.findById(id).get();
            userRepo.delete(deletedUser);
            return "deleted user with id :" +id ;
        }

}
