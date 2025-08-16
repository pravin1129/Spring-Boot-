package com.demo.pravin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pravin.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
