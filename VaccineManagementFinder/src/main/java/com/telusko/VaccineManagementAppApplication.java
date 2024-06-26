package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
	
	VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	service.searchByVaccineCompany("Astrazen").forEach(c->System.out.println(c));
	service.searchByVaccineName("Phizer").forEach(c->System.out.println(c));
	
	context.close();
	}

}
