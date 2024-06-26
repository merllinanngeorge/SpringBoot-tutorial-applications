package com.telusko.service;

import java.util.List;
import com.telusko.ResultView;

public interface IVaccineManagement 
{
	public List<ResultView> searchByVaccineCompany(String vaccinecompany);
	public List<ResultView> searchByVaccineName(String vaccinename);
	public List<ResultView> searchByPriceLessThan(Integer price);
     
}
