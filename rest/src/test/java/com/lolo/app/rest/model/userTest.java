package com.lolo.app.rest.model;

import com.lolo.app.rest.Controller.UserController;
import com.lolo.app.rest.Repo.userRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


public class userTest {
    private userRepo users;
    private user User;

    @Test
    public void getUserTest(){
        List<user> User = users.findAll();
        assertThat(User.isEmpty());

    }
    
}
