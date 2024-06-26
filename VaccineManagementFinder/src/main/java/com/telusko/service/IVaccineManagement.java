package com.telusko.service;

import java.util.List;
import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
	public List<VaccineDetails> searchByVaccineCompany(String vaccinecompany);
	public List<VaccineDetails> searchByVaccineName(String vaccinename);
     
}
