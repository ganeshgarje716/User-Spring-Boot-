package com.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	@Column(unique = true)
	private String mobileNo;
	
	private String address;
	
	private Integer age;

	
	
	
	
	public User(String name, String email, String password, String mobileNo, String address, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.address = address;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	

}
