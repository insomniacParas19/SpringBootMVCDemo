package com.insotech.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insotech.springbootdemo.model.User;
import com.insotech.springbootdemo.repository.UserRepository;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}

	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
			
	//		model.addAttribute("user",user.getUsername());
	//		return "UserResult";
		
	userRepo.save(user);
			return "LoginForm";
		
	}
}
