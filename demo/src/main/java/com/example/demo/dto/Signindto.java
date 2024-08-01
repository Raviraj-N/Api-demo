package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Signindto {
	

		
		
	        private Long id;
		    private Long mobileNo;
		    private String email;
		    private String password;
			
		    public Signindto(Long id, Long mobileNo, String email, String password) {
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


