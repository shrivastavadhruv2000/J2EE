package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/second")
public class SecondController {
	
//	@GetMapping("/new")
//	public ModelAndView heyNew() {
//		String s="Second Controller";
//		return new ModelAndView("Welcome","msg",s);
//		
//		
//	}
	@GetMapping("/custmer1")
	public ModelAndView sayHello() {
		System.out.println("customer called");
		String s="Hello World from customer1!!";
		return new ModelAndView("Welcome","msg",s);
		
	}

}
