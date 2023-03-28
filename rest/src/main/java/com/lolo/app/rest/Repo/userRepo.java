package com.lolo.app.rest.Repo;

import com.lolo.app.rest.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository <user, Long >{
}
