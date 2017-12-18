package com.bus.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bus.model.Registration;

public class RegistrationDAOImpl implements RegistartionDAO {
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	public void setDataSouce(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public String addNewUser(Registration reg) {
		String msg= "";
		
		String query = "insert into user"; 
		Object [] arg = {};
		
		int n = jdbcTemplate.update(query, arg);
		
		if(n == 0) {
			msg ="User with this email already exits";
		}
		else { 
			msg="Succesfully Registered";
		}
		
		return msg;
	}

}
