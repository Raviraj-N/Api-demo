package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Signupdto;

public interface Signupservice {
	public Signupdto createSignup(Signupdto signupdto);
	
	  Signupdto getSignupById(Long SignupId);

	    List<Signupdto> getAllSignup();

	    Signupdto updateSignup(Long SignupId, Signupdto updatedsignup);

	    void deleteSignup(Long SignupId);

}
