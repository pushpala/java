package com.bus.model;
import javax.validation.constraints.*;

public class Registration {
	


	@Size(max=45)
	private String first_name;
	

	@Size(max=45)
	private String last_name;
	
		
	@Size(max=45, message="MAx 45 chars is allowed")
	private String email;
	
	
	@Size(min=6, max=45)
	private String password;
	
	@Min(20)
	@Max(80)
	private int age;
	
	
	public Registration() {
		super();
	}

	public Registration(String first_name, String last_name, String email, String password, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
