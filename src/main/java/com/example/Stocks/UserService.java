package com.example.Stocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Stocks.UserDTO;
import com.example.Stocks.User;
import com.example.Stocks.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User saveUser(User ud){
		//User user = new User(ud.getF_name(),ud.getL_name(),ud.getEmail(),ud.getMobile_no(),ud.getPassword());
		return userRepo.save(ud);
	}
	
	


}
