package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class Stuvalidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		
		return StuDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		
		StuDto stud = (StuDto) obj;
		

		if(stud.getName()==null || stud.getName().trim().isEmpty()) {
		
			System.out.println("아이디 공백 에러");
			errors.rejectValue("id", "아이디 공백에러");
			
		} 
		
		
	}
	
	
	
	
	

}
