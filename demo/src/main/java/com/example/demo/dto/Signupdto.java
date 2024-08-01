package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Signupdto {
	
	
        private Long id;
	    private String name;
	    private Long mobileNo;
	    private String email;
	    private String password;
	    private String repassword;
	    
		public Signupdto(Long id, String name, Long mobileNo, String email, String password, String repassword) {
			super();
			this.id = id;
			this.name = name;
			this.mobileNo = mobileNo;
			this.email = email;
			this.password = password;
			this.repassword = repassword;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getRepassword() {
			return repassword;
		}
		public void setRepassword(String repassword) {
			this.repassword = repassword;
		}
	}



