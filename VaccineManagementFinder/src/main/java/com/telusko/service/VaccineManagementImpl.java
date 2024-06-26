package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> searchByVaccineCompany(String vaccinecompany) 
	{
		System.out.println("My custom finder method is implemented by : "+repo.getClass().getName());
		return repo.findByVaccineCompany(vaccinecompany);
	}

	@Override
	public List<VaccineDetails> searchByVaccineName(String vaccinename) {
		
		return repo.findByVaccineName(vaccinename);
	}

}
