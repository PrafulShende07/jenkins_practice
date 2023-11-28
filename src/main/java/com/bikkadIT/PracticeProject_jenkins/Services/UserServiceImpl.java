package com.bikkadIT.PracticeProject_jenkins.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIT.PracticeProject_jenkins.Entity.User;
import com.bikkadIT.PracticeProject_jenkins.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean createUser(User user) {
		User save = userRepo.save(user);
		if(save != null) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public User getUser(Integer uid) {
		User findById = userRepo.findById(uid).get();
		return findById;
	}

}
