package com.learning.dto;

public class CustomerDTO 
{
private String id;
	
	private Integer cusNo;
	
	private String name;
	
	private String city;
	
	public CustomerDTO()
	{
		System.out.println("Customer zero param constructor");
	}
	
	public CustomerDTO(Integer cusNo, String name, String city) 
	{
		super();
		this.cusNo = cusNo;
		this.name = name;
		this.city = city;
	}

	public Integer getCusNo() {
		return cusNo;
	}

	public void setCusNo(Integer cusNo) {
		this.cusNo = cusNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusNo=" + cusNo + ", name=" + name + ", city=" + city + "]";
	}

}
