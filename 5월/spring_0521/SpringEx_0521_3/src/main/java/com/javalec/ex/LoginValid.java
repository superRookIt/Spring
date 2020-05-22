package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValid implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return LoginDto.class.isAssignableFrom(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		LoginDto ldto = (LoginDto) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "아이디 공백 에러");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "비밀번호 공백 에러");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "이름 공백 에러");

//		if (ldto.getName() == null || ldto.getName().trim().isEmpty()) {
//
//			System.out.println("이름 공백 에러");
//			errors.rejectValue("name", "이름 공백 에러");
//
//		}

	}

}
