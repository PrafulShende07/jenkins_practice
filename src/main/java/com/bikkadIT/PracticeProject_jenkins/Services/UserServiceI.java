package com.bikkadIT.PracticeProject_jenkins.Services;

import com.bikkadIT.PracticeProject_jenkins.Entity.User;

public interface UserServiceI {

	
	public boolean createUser(User user);
	
	User getUser(Integer uid);

}
