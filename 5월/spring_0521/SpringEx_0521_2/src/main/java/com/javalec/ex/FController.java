package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FController {
	
	
	
	@RequestMapping("form")
	public String form() {
		
		return "form";
	}
	
	
	@RequestMapping("formOk")
	public String formOk(StuDto studto, BindingResult result) {
		
		   String page="formOk";
		
           Stuvalidator stuval = new Stuvalidator();
           
           stuval.validate(studto, result);
           
           if(result.hasErrors()) {
        	   
        	   page="form";
           }
           
		
		return page ;
		
	}
	
	
	

}
