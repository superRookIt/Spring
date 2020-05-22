package com.javalec.ex;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LController {

	
	
	@RequestMapping("login")
	public String login() {
		
		return "login";
		
	} 
	
	
	
	@RequestMapping("loginOk")
	public String loginOk(@Valid LoginDto loginDto, BindingResult result ) {
		
		
		
		String page="loginOk";
		
		
		if(result.hasErrors()) {
			
			page="login";
			
		}
		
		return page;
	}
	
	
	
	@InitBinder
	protected void init(WebDataBinder binder) { //★
		
		binder.setValidator(new LoginValid());
		
	}
	
	
	
}
