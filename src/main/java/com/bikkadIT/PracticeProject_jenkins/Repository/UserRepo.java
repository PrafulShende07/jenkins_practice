package com.bikkadIT.PracticeProject_jenkins.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIT.PracticeProject_jenkins.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
