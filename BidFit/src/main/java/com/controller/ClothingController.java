package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.business.ClothingBusinessService;
import com.models.ClothingModel;

import data.entity.ClothingEntity;

@Controller
@RequestMapping("/clothing")
public class ClothingController {
	
	@Autowired
	ClothingBusinessService serviceClothing;
	
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("products", serviceClothing.findAll());
		
		return "clothing";
	}
	
	
	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("ClothingModel", new ClothingModel());
		
		return "createClothing";
	}
	
	
	@PostMapping("/doCreate")
	public String doCreate(@Valid Model model, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			System.out.println("Error");
			return "createClothing";
		}
		
		model.addAttribute("products", serviceClothing.findAll());
		
		return "clothing";
	}

	// Alex code
	@GetMapping("/all") 
	public String showClothing( Model model) {  
		List<ClothingEntity> products = serviceClothing.findAll();
		System.out.println(products + "all products");
		//model.addAttribute("searchModel", new SearchProductsModel());
		model.addAttribute("products", products);
		// show all products
		// return "products";
		return "productsImages";
	}
	
	@GetMapping("/one")
	public String displayOne(Model model) {
		model.addAttribute("message", "test");
		return "oneClothing";
	}


}
