package com.telusko;

import java.util.ArrayList;
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
	
//	VaccineDetails vaccine = new VaccineDetails();
//	vaccine.setId(1L);
//	vaccine.setPrice(5674);
//	vaccine.setVaccineCompany("abc");
//	vaccine.setVaccineName("Russia");
//	
//	service.searchVaccineByGivenData(vaccine, true, "vaccineName", "vaccineCompany").forEach(v->
//	System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
	
//	service.searchVaccineByGivenObject(vaccine).forEach(v->System.out.println(v.getVaccineCompany()+" "+v.getVaccineName()));
	
	List<Long> ids = new ArrayList<Long>();
	ids.add(1L);
	ids.add(4L);
	System.out.println(service.removeVaccinesByIds(ids));
	
	context.close();
	}

}
