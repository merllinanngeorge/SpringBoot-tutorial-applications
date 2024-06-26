package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;


@Service
public class VaccineManagementImpl implements IVaccineManagement 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine, boolean status, String... args) 
	{
		Example<VaccineDetails> example = Example.of(vaccine);
		Sort sort = Sort.by(status? Direction.ASC : Direction.DESC , args);
		return repo.findAll(example, sort);	 
	}

	@Override
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine) 
	{
		Example<VaccineDetails> example = Example.of(vaccine);
		return repo.findAll(example);  
	}

	@Override
	public String removeVaccinesByIds(Iterable<Long> ids) 
	{
		List<VaccineDetails> list = repo.findAllById(ids);
		if(list.size() != 0)
		{
			repo.deleteAllByIdInBatch(ids);
			return "Record deleted with the given ids";
		}
		return "Deletion not possible. Check the ids";
		
	}


}
