package com.learning;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.bo.Customer;
import com.learning.dto.CustomerDTO;
import com.learning.service.CustomerService;

@SpringBootApplication
public class SpringBootMongoDbApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMongoDbApplication.class, args);
		CustomerService service = context.getBean(CustomerService.class);
		
		
//		CustomerDTO dto= new CustomerDTO(1,"Merllin", "Kerala");
//		String status = service.registerService(dto);
//		System.out.println(status);
		
//		service.findAllCustomers().forEach((c)->System.out.println(c));
		
		System.out.println(service.removeDocument("66725661fa767c047dc394c3"));
	}

}
