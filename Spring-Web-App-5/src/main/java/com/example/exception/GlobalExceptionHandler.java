package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NoSuchCustomerException.class)
	public ModelAndView handleCustomerNotFoundException(NoSuchCustomerException nsce) {
		
		ModelAndView mav=new ModelAndView("singlecustomer");
		mav.addObject("error", nsce.getMessage());
		return mav;
	}
	@ExceptionHandler(MismatchException.class)
	public ModelAndView hhandleCustomerNotFoundException(MismatchException nsce) {
		
		ModelAndView mav=new ModelAndView("singlecustomer");
		mav.addObject("errorr", nsce.getMessage());
		return mav;
	}

}
