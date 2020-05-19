package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ncontroller {
	
	@RequestMapping(value="noticeList")
	public String noticeList() {
		
		return "noticeList";
		
	}
	

}
