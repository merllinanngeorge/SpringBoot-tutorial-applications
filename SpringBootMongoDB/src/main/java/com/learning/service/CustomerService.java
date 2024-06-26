package com.learning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.bo.Customer;
import com.learning.dao.ICustomerRepo;
import com.learning.dto.CustomerDTO;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class CustomerService implements ICustomerService 
{
	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String registerService(CustomerDTO dto) 
	{
		Customer cusDocument = new Customer();
		BeanUtils.copyProperties(dto, cusDocument);
		repo.save(cusDocument);
		return "Data stored as Document in mongodb with id : "+cusDocument.getCusNo();
	}

	@Override
	public List<Customer> findAllCustomers() 
	{
		
		return repo.findAll();
	}

	@Override
	public String removeDocument(String id) 
	{
		Optional<Customer> document = repo.findById(id);
		if(document.isPresent())
		{
//			repo.delete(document.get());
			repo.deleteById(id);
			return "Document with given id got deleted";
		}
		return "Couldn't find the document with the given id";
	}

}
