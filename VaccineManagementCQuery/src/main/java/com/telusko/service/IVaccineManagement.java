package com.telusko.service;

import java.util.List;

import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
	public List<VaccineDetails> fetchVaccineByVaccineCompany(String company);
	public List<VaccineDetails> fetchVaccineByVaccineCompanies(String cmp1, String cmp2);
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max);
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1, String vac2);
	public int savePriceByVaccine(Integer newPrice, String vaccineName);
	public int deleteVaccinesbyPriceRange(Integer minprice, Integer maxprice);
     
}
