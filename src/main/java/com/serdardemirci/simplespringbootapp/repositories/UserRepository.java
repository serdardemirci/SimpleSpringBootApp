package com.serdardemirci.simplespringbootapp.repositories;

import com.serdardemirci.simplespringbootapp.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser getUserByUserName(String username);
}
