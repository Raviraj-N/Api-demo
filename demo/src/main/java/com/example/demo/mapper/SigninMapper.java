package com.example.demo.mapper;

import com.example.demo.dto.Signindto;
import com.example.demo.entity.Signin;

public class SigninMapper {
	
	
      public static Signindto mapToSignindto(Signin signin){
		                
    	  return new Signindto(
		        		signin.getId(),
		                signin.getMobileNo(),
		                signin.getEmail(),
		                signin.getPassword()
		                
		                
		        );
		    }

		    public static Signin mapToSignin(Signindto SigninDto){
		        return new Signin(
		                SigninDto.getId(),
		                SigninDto.getMobileNo(),
		                SigninDto.getEmail(),
		                SigninDto.getPassword()
		               
		               
		                
		               
		        );
		    }
		}

	
	


