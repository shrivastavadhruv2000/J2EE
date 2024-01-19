package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@GetMapping("/baller")
	public ModelAndView sayHello() {
		System.out.println("SayHello Called");
		String s="Ankle Breaker";
		
		return new ModelAndView("Welcome","msg",s);
		
	}
	
	@GetMapping("/test")
	public String method1(Model m) {
		m.addAttribute("msg","Hello");
		m.addAttribute("num1",10);
		m.addAttribute("num2",20);
		return "testaddition";
		
	}

}
