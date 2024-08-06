package com.example.demo.controller;

	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import com.example.demo.dto.Signupdto;
	import com.example.demo.service.Signupservice;

	import lombok.AllArgsConstructor;

		
		@CrossOrigin("*")
		@AllArgsConstructor
		@RestController
		@RequestMapping("/api/employees")
		
		public class SignupController {
		
		   @Autowired
			private Signupservice signupService;

		    // Build Add Employee REST API
		    @PostMapping
		    public ResponseEntity<Signupdto> createSignup(@RequestBody Signupdto signupDto){
		        Signupdto savedSignup = signupService.createSignup(signupDto);
		        return new ResponseEntity<>(savedSignup, HttpStatus.CREATED);
		    }

		    // Build Get Employee REST API
		    @GetMapping("{id}")
		    public ResponseEntity<Signupdto> getSignupById(@PathVariable("id") Long SignupId){
		        Signupdto Signupdto = signupService.getSignupById(SignupId);
		        return ResponseEntity.ok(Signupdto);
		    }
	
		     //Build Get All Employees REST API
		    @GetMapping
		   
		    public ResponseEntity<List<Signupdto>> getAllSignup(){
		        List<Signupdto> employees = signupService.getAllSignup();
		        return ResponseEntity.ok(employees);
		    }
	
		     //Build Update Employee REST API
		   
		    @PutMapping("/{id}")
		    public ResponseEntity<Signupdto> updateSignup(@PathVariable("id") Long SignupId,
		                                                      @RequestBody Signupdto updatedEmployee){
		          Signupdto Signupdto = signupService.updateSignup(SignupId, updatedEmployee);
		          return ResponseEntity.ok(Signupdto);
		    }
	
		    // Build Delete Employee REST API
		  
		    @DeleteMapping("/{id}")
		    public ResponseEntity<String> deleteSignup(@PathVariable("id") Long SignupId){
		        signupService.deleteSignup(SignupId);
		        return ResponseEntity.ok("Employee deleted successfully!.");
		    }
		}
	

	



