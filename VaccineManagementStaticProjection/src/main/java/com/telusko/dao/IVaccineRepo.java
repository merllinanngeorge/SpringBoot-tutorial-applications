package com.telusko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.telusko.ResultView;
import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> 
{
	public List<ResultView> findByVaccineCompany(String vaccinecompany);
	public List<ResultView> findByVaccineName(String vaccineName);
	public List<ResultView> findByPriceLessThan(Integer price);
	
}
