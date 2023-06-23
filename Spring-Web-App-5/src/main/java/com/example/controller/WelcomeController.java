package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class WelcomeController 
{
	@GetMapping
	public ModelAndView getWelcomePage()
	{
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
		
	}

}
