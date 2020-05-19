package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Econtroller {
	
	
	@RequestMapping(value="eventList")
	public String eventList() {
		
		return "eventList";
		
	}
	
	
	

}
