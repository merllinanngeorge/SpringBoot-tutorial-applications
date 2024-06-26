package com.telusko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> 
{
	public List<VaccineDetails> findByVaccineCompany(String vaccinecompany);
	public List<VaccineDetails> findByVaccineName(String vaccineName);
}
