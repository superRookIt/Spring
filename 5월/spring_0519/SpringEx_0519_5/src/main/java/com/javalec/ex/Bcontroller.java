package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Bcontroller {

	
	
	
	@RequestMapping(value="member/memberList")
	public String memberlist() {
		
		return "member/memberList";
	}
	
	
	
	
	
	
	
	
	
	
	
}
