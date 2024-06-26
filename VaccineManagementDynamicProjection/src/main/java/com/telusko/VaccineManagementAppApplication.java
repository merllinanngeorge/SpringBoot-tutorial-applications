package com.telusko;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineManagementImpl;
import com.telusko.view.ResultView2;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
	
	VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	List<ResultView2> list = service.fetchByVaccineCompany("Astrazen", ResultView2.class);
	list.forEach((c)->System.out.println(c.getId()+" : "+c.getVaccineCompany()+" : "+c.getVaccineName()));
	
	context.close();
	}

}
