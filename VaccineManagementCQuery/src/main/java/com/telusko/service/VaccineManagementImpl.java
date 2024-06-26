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
	public List<VaccineDetails> fetchVaccineByVaccineCompany(String company) 
	{
		// TODO Auto-generated method stub
		return repo.searchVaccineByVaccineCompany(company);
	}

	@Override
	public List<VaccineDetails> fetchVaccineByVaccineCompanies(String cmp1, String cmp2) 
	{
		
		return repo.searchVaccineByVaccineCompanies(cmp1, cmp2);
	}

	@Override
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max) 
	{
		
		return repo.searchVaccineByPriceRange(min, max);
	}

	@Override
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1, String vac2) {
		
		return repo.searchVaccineDetailsByVaccineName(vac1, vac2);
	}

	@Override
	public int savePriceByVaccine(Integer newPrice, String vaccineName) {
		
		return repo.updatePriceByVaccine(newPrice, vaccineName);
	}

	@Override
	public int deleteVaccinesbyPriceRange(Integer minprice, Integer maxprice) {
		
		return repo.deleteVaccinebyPriceRange(minprice, maxprice);
	}
}

