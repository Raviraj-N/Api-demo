package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Signin")
public class Signin {
	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @Column(name = "Mobile_No")
	    private Long mobileNo;

	    @Column(name = "email_id", nullable = false, unique = true)
	    private String email;
	    
	    @Column(name = "Password")
	    private String password;

		public Signin(Long id, Long mobileNo, String email, String password) {
			super();
			this.id = id;
			this.mobileNo = mobileNo;
			this.email = email;
			this.password = password;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(Long mobileNo) {
			this.mobileNo = mobileNo;
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



