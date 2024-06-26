package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

import jakarta.transaction.Transactional;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> 
{
	@Query("from VaccineDetails where vaccineCompany=:company")
	public List<VaccineDetails> searchVaccineByVaccineCompany(String company);
	
	@Query("from VaccineDetails where vaccineCompany in (:cmp1, :cmp2)")
	public List<VaccineDetails> searchVaccineByVaccineCompanies(String cmp1, String cmp2);
	
	@Query("Select vaccineName, vaccineCompany from VaccineDetails where price between :min and :max")
	public List<String> searchVaccineByPriceRange(Integer min, Integer max);
	
	@Query("Select vaccineCompany, price from VaccineDetails where vaccineName in (:vac1, :vac2)")
	public List<Object[]> searchVaccineDetailsByVaccineName(String vac1, String vac2);
	
	@Transactional
	@Modifying
	@Query("Update VaccineDetails set price = :newPrice where vaccineName= :vaccineName")
	public int updatePriceByVaccine(Integer newPrice, String vaccineName);
	
	@Transactional
	@Modifying
	@Query("Delete from VaccineDetails where price between :minprice and :maxprice")
	public int deleteVaccinebyPriceRange(Integer minprice, Integer maxprice);

}
