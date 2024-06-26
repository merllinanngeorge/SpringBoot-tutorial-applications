package com.learning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc 
{
	private static final String SQL_QUERY = "Insert into student (id, name, city) values (1, 'Merllin', 'Kerala')";
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public void insert()
	{
		jdbc.update(SQL_QUERY);
	}

}

