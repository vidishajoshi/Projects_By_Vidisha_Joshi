package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/signup")
	public String showSignUpForm(User user) {
		return "add-user";
	}
	
	@PostMapping("/adduser")
	public String addUser(@Validated User user,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add-user";
		}
		userRepository.save(user);
		model.addAttribute("users",userRepository.findAll());
		return "index";
	}

}
