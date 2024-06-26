package com.learning.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learning.bo.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> 
{

}
