package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Customer;
import com.example.exception.MismatchException;
import com.example.service.CustomerService;

@Controller
public class CustomerController {
	private CustomerService customerService;
	
	@Autowired
	public void setCustomeService(CustomerService customerService)
	{
		this.customerService = customerService;
	}
	@GetMapping
	public String welcome()
	{
		return "welcome";
	}
	@GetMapping(value="/saveCustomer")
	public ModelAndView getCustomerRegistrationPage() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}
	@PostMapping(value="/saveCustomer")
	public ModelAndView postCustomerRegistrationPage(@ModelAttribute Customer customer) {
		Customer c = customerService.saveCustomer(customer);
		ModelAndView mav = new ModelAndView("registration");
		mav.addObject("customer", c);
		return mav;
	}
	@GetMapping(value="/sinlgecustomer")
	public ModelAndView getSinglePage() {
		ModelAndView mav = new ModelAndView("singlecustomer");
		return mav;
	}
	@PostMapping(value="/sinlgecustomer")
	public ModelAndView postSinglePage(@RequestParam String cid) {
		try
		{
			Integer.parseInt(cid);
		}
		catch(Exception e)
		{
			throw new MismatchException("Input must be a number");
		}
		Customer customer=customerService.getCustomerById(Integer.parseInt(cid));
		ModelAndView mav = new ModelAndView("singlecustomer");
		mav.addObject("customer", customer);
		return mav;
	}
	
	@GetMapping(value="/getAllcustomers")
	public ModelAndView getAllCustomers() {
		List<Customer> customer = customerService.getAllCustomers();
		ModelAndView mav = new ModelAndView("allcustomers");
		mav.addObject("customer", customer);
		return mav;
	}
	@GetMapping(value="/deletecustomer")
	public ModelAndView getDeleteCustomer() {
		ModelAndView mav = new ModelAndView("deletecustomer");
		return mav;
	}
	
	@PostMapping(value="/deletecustomer")
	public ModelAndView postDeleteCustomer(@RequestParam String cid) {
		try
		{
			Integer.parseInt(cid);
		}
		catch(Exception e)
		{
			throw new MismatchException("Input must be a number");
		}
		customerService.deleteCustomer(Integer.parseInt(cid));
		ModelAndView mav = new ModelAndView("deletecustomer");
		return mav;
	}
	@GetMapping(value="/updateCustomer")
	public ModelAndView getUpdateCustomer()
	{
		ModelAndView mav = new ModelAndView("updatecustomer");
		System.out.println("Hello");
		return mav;
	}
	@PostMapping(value="/updateCustomer")
	public ModelAndView postUpdateCustomer(@RequestParam Integer cid,@RequestParam String cname,@RequestParam long cmobile,@RequestParam String ccity)
	{
		System.out.println("CAME");
		System.out.println(cid);
		Customer cust = customerService.getCustomerById(cid);
		customerService.updateCustomer(cid,cname,cmobile,ccity);
		List<Customer> c = customerService.getAllCustomers();
		ModelAndView mav = new ModelAndView("allcustomers");
		mav.addObject("customer",c );
		return mav;
		
	}
	
	

}
