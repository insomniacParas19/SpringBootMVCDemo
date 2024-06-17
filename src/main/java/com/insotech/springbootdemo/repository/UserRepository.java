package com.insotech.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insotech.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
