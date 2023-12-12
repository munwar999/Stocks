package com.example.Stocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Stocks.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/save")
	public boolean savePerson(@Valid @RequestBody UserDTO user) {
		
			User p = new User(user.getF_name(),user.getL_name(),user.getEmail(),
					user.getMobile_no(),user.getPassword());
			
			userService.saveUser(p);
			
			//System.out.println("Account Created Successfully " +user.getF_name() +" "
			//+user.getL_name()+" "+user.getEmail());
			return true;
	}
	



}




