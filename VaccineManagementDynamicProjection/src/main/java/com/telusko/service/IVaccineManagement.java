package com.telusko.service;

import java.util.List;

import com.telusko.view.View;

public interface IVaccineManagement 
{
	public <T extends View>List<T> fetchByVaccineCompany(String vaccineCompany, Class<T> cls);
     
}
