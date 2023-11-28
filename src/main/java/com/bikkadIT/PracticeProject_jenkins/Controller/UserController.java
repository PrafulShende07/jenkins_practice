package com.bikkadIT.PracticeProject_jenkins.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.PracticeProject_jenkins.Entity.User;
import com.bikkadIT.PracticeProject_jenkins.Services.UserServiceI;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping("/createuser")
	public ResponseEntity<String> createUser(@RequestBody User user){
		 boolean createUser = userServiceI.createUser(user);
		 if(createUser) {
			 return new ResponseEntity<String>("save sucessfully",HttpStatus.CREATED);
		 }else {
			 return new ResponseEntity<String>("save not sucessfully",HttpStatus.CREATED);
		 }
		
	}
	
	@GetMapping("/getUser/userid/{uid}")
	public ResponseEntity<User> getUser(@PathVariable Integer uid){
		User user = userServiceI.getUser(uid);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}


}
