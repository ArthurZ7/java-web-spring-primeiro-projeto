package com.arthurib.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurib.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
