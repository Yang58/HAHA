package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.service.TestService;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/Limi/*")
@Log4j
@AllArgsConstructor
public class HomeController {
	
	@Setter(onMethod_ = @Autowired)
	private TestService service;
	
	@GetMapping("/home")
	public String home(Model model){
		
		log.info("list" + service.getList());
		model.addAttribute("list" , service.getList());
		return "home";
	}
	
}
