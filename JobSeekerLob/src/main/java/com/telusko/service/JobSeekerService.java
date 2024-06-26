package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.JobSeeker;
import com.telusko.dao.IJobSeekerDao;

@Service
public class JobSeekerService implements IJobSeekerService 
{
	@Autowired
	private IJobSeekerDao repo;

	@Override
	public String registerJobSeeker(JobSeeker seeker) {
		
		 Integer id = repo.save(seeker).getId();
		 return "Jobseeker with id : "+id+" got registered successfully!";
	}

	@Override
	public Optional<JobSeeker> getDetailsById(Integer id) 
	{
		return repo.findById(id);
		
	}

	

}
