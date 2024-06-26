package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>
{

}
