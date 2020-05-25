package com.javalec.ex.Bcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.javalec.ex.Util.Constant;

@Controller
public class BController {
	
	JdbcTemplate template;

	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
		
	}
	
	
	
	
	
	
	

}
