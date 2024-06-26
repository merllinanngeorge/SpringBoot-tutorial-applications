package com.telusko;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		service.fetchVaccineByVaccineCompany("Astrazen").forEach((c)->System.out.println(c.getId()+" : "
				+ c.getVaccineCompany()+ " : "+c.getVaccineName()+" : "+c.getPrice()));
		
		List<VaccineDetails> list = service.fetchVaccineByVaccineCompanies("Astrazen", "US");
		list.forEach(c->System.out.println(c));
		
		List<String> list1 = service.fetchVaccineByPriceRange(3456, 4783);
		list1.forEach((c)->System.out.println(c));
		
		List<Object[]> list3 = service.fetchVaccineDetailsByVaccineName("Phizer", "Sputnik");
		for(Object[] obj: list3) 
		{
			for(Object vaccine: obj)
			{
				System.out.println(vaccine);
			}
		}
		
		System.out.println(service.savePriceByVaccine(2545, "Sputnik"));
		System.out.println("Number of rows deleted are : "+service.deleteVaccinesbyPriceRange(6000, 9500));
		
		context.close();
		

	}

}
 