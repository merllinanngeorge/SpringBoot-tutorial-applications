package com.telusko.service;

import java.util.List;

import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{    
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine, boolean staus, String... args);
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine);
	public String removeVaccinesByIds(Iterable<Long> ids);
}
