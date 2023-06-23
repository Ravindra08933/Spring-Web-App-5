package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.example.entity.Customer;
import com.example.exception.NoSuchCustomerException;
import com.example.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	@Autowired
	public void setCustomerRepository(CustomerRepository customerrepository)
	{
		customerRepository = customerrepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id).orElseThrow(()->new NoSuchCustomerException("Customer with given ID : "+id+" not found"));
		 
	}

	@Override
	public void deleteCustomer(Integer id) {
		try
		{
		customerRepository.deleteById(id);
		}
		catch(Exception e)
		{
			throw new NoSuchCustomerException("Customer with given ID : "+id+" not found");
		}
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Integer cid,String cname,long cmobile,String ccity) {
		Customer cust  = getCustomerById(cid);
		cust.setCcity(ccity);
		cust.setCmobile(cmobile);
		cust.setCname(cname);
		return customerRepository.save(cust);
	}
}
