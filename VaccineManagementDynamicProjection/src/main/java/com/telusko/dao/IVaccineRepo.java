package com.telusko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;
import com.telusko.view.View;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> 
{
	public <T extends View>List<T> findByVaccineCompany(String vaccineCompany, Class<T> cls);
}
