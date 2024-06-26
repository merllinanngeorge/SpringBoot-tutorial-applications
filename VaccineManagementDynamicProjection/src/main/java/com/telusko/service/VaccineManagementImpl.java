package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.IVaccineRepo;
import com.telusko.view.View;

@Service
public class VaccineManagementImpl implements IVaccineManagement 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public <T extends View> List<T> fetchByVaccineCompany(String vaccineCompany, Class<T> cls) {
		return repo.findByVaccineCompany(vaccineCompany, cls);
	}

}
