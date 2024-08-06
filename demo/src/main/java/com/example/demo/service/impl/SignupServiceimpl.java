package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Signupdto;
import com.example.demo.entity.Signup;
import com.example.demo.exception.Resourcenotfoundexception;
import com.example.demo.mapper.SignupMapper;
import com.example.demo.repository.Signuprepository;
import com.example.demo.service.Signupservice;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class SignupServiceimpl implements Signupservice {
	
	
			@Autowired
		    private Signuprepository signupRepository;

		    @Override
		    public Signupdto createSignup(Signupdto SignupDto) {

		        Signup Signup = SignupMapper.mapToSignup(SignupDto);
		        Signup savedSignup = signupRepository.save(Signup);
		        return SignupMapper.mapToSignupdto(savedSignup);
		    }
		    
		    
		    @Override
		    public Signupdto getSignupById(Long SignupId) {
		        Signup auth = signupRepository.findById(SignupId)
		                .orElseThrow(() ->
		                        new Resourcenotfoundexception("Employee is not exists with given id : " + SignupId));

		        return SignupMapper.mapToSignupdto(auth);
		    }

		    @Override
		    public List<Signupdto> getAllSignup() {
		        List<Signup> auths = signupRepository.findAll();
		        return auths.stream().map((auth) -> SignupMapper.mapToSignupdto(auth))
		                .collect(Collectors.toList());
		    }

		    @Override
		    public Signupdto updateSignup(Long SignupId, Signupdto updatedsignup) {

		        Signup auth = signupRepository.findById(SignupId).orElseThrow(
		                () -> new Resourcenotfoundexception("Employee is not exists with given id: " + SignupId)
		        );
		        auth.setMobileNo(updatedsignup.getMobileNo());
		        auth.setEmail(updatedsignup.getEmail());
		        auth.setPassword(updatedsignup.getPassword());
		        auth.setRepassword(updatedsignup.getRepassword());
		        

		        Signup updatedSignupObj = signupRepository.save(auth);

		        return SignupMapper.mapToSignupdto(updatedSignupObj);
		    }

		    @Override
		    public void deleteSignup(Long SignupId) {

		        Signup auth = signupRepository.findById(SignupId).orElseThrow(
		                () -> new Resourcenotfoundexception("Employee is not exists with given id: " +SignupId)
		        );

		        signupRepository.deleteById(SignupId);
		    }
		}

			

		    
		
	
	
	
	


