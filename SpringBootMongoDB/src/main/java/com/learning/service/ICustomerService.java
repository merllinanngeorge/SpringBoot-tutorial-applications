package com.learning.service;

import java.util.List;

import com.learning.bo.Customer;
import com.learning.dto.CustomerDTO;

public interface ICustomerService 
{
	public String registerService(CustomerDTO customer);
	public List<Customer> findAllCustomers();
	public String removeDocument(String id);

}
