package com.telusko;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
	
	VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	List<ResultView> list = service.searchByPriceLessThan(6732);
	list.forEach((c)->System.out.println(c.getVaccineCompany()+" : "+c.getVaccineName()));
	
	context.close();
	}

}
