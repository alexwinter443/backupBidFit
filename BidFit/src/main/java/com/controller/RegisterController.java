package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.business.ClothingBusinessService;
import com.business.UserBusinessService;
import com.data.DataAccessInterface;
import com.data.UserDataService;
import com.models.UserModel;


@Controller
@RequestMapping("/auth")
public class RegisterController 
{
	@Autowired
	private UserBusinessService service;
	

	@GetMapping("/")
	public String registerPage(Model model)
	{
		model.addAttribute("Title", "Register Form");
		model.addAttribute("userModel", new UserModel());
		return "register.html";
	}
	
	//prevents the user from registering without using a POST request
		@GetMapping("/doRegister")
		@ResponseBody
		
		/**
		 * a simple method that returns an error if the location for the POST request is reached by a GET request
		 * @return
		 */
		public String returnError()
		{
			return "No hacking allowed.";
		}
		@PostMapping("/doRegister")
		
		public String doRegister(UserModel userModel, BindingResult bindingResult, Model model)
		{
			
			System.out.println(String.format("User registered with the first name of %s, last name of %s, Email address of %s, phone number of %s, username of %s, and password of %s ", userModel.getFirstName(),userModel.getLastName(),userModel.getEmail(),userModel.getPhoneNumber(),userModel.getUsername(),userModel.getPassword()));
		
			//Check for validation Errors
			if(bindingResult.hasErrors())
			{
				model.addAttribute("title", "Registration page");
				return "register";
			}
			//add user to database on success
			service.create(userModel);
			//adds a message to the redirected page
			model.addAttribute("loginSuccess", "Thank you for logging in!");
			return "home";
		}
}
