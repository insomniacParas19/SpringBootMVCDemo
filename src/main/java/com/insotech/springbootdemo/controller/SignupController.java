package com.insotech.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insotech.springbootdemo.model.User;

@Controller
public class SignupController {
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}

	@PostMapping("/signup")
	public String doSignup(@ModelAttribute User user, Model model) {
		
if(user.getUsername().equals("Puran") && user.getPassword().equals("1234")) {
			
			model.addAttribute("user",user.getUsername());
			return "UserResult";
		}
	
			
			model.addAttribute("user",user);
			return "SignupForm";
		
	}
}
