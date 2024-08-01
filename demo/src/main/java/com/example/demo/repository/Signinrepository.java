package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Signin;

public interface Signinrepository extends JpaRepository<Signin, Long> {
	
	

}
