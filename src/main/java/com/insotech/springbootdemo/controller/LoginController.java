package com.insotech.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insotech.springbootdemo.model.User;


@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}

	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user, Model model) {
		
		if(user.getUsername().equals(user.getUsername()) && user.getPassword().equals(user.getPassword())) {
			
			model.addAttribute("user",user.getUsername());
			return "Home";
		}
		
		model.addAttribute("message","Invalid credentials !");
		return "LoginForm";
	}
}
