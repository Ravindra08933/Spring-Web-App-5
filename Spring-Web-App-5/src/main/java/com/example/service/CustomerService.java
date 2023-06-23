package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public void deleteCustomer(Integer id);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Integer Id,String name,long mobile,String city);

}
