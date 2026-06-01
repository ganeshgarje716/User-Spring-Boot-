package com.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.entity.User;
import com.ganesh.repository.UserRepository;

@SpringBootApplication
public class SpringBootUserApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserApplication.class, args);
	}
	
	
	
	@Autowired
	UserRepository UR;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
