package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.LoginDto;

public class LoginValidator implements Validator {

	
	//검색 할 객체
	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginDto.class.isAssignableFrom(clazz);
		
	}
	
	
	
    // 검증할 방법을 구현
	@Override
	public void validate(Object obj, Errors errors) {
		
		
		LoginDto ldto= (LoginDto) obj;
		
		
		
//		if(ldto.getId()==null || ldto.getId().trim().isEmpty()) {
//		
//			errors.rejectValue("id", "아이디 공백에러");
//		
//		} 

		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "아이디 공백 에러");
		
		
		
		
//		if(ldto.getId().length()<=3) {
//			
//			errors.rejectValue("idlength", "아이디 3자리 이하 에러");
//			
//		}
		
		
		
		
		
		
//		if(ldto.getPw()==null || ldto.getPw().trim().isEmpty()) {
//			
//			errors.rejectValue("pw", "패스워드 공백에러");
//			
//			
//		}
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "패스워드 공백에러");
		
		
	}

	

}
