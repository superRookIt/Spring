package com.javalec.ex;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dto.JoinDto;
import com.javalec.ex.Dto.LoginDto;
import com.javalec.ex.Dto.Student;


@Controller
public class JoinController {
	
	
	
	@RequestMapping("input")
	public String input() {
		
		
		return "input";
		
	}
	
	
	
	
	@RequestMapping("inputOk")
	public String inputOk(@Valid LoginDto loginDto, BindingResult result) { //똑같은데 앞에 있는 것만 소문자
		
		String page = "inputOk";
		
//		LoginValidator valid = new LoginValidator();
//		valid.validate(loginDto, result);  

		
		if(result.hasErrors()) {
			
			page="input";
			
		}
		
		return page;
		
	}
	
	
	
	@InitBinder
	protected void InitBinder(WebDataBinder binder) {
		
		binder.setValidator(new LoginValidator());
		
	}
	
	
	@RequestMapping("form")
	public String form() {
		
		
		return "form";
		
	}
	
	
	
	@RequestMapping("formOk")
	public String formOk(@ModelAttribute("stu") Student student) {
		
		
		return "formOk";
		
	}
	
	
	
	@RequestMapping("join")
	public String join() {
		
		
		return "join";
		
	}
	
	
	
	
//	@RequestMapping("joinOk")
//	public String joinOk(HttpServletRequest request, Model model) {
//		
//		
//		JoinDto jdto= new JoinDto();
//		jdto.setName(request.getParameter("name"));
//		
//		model.addAttribute("jdto", jdto);
//		
//		return "joinOk";
//		
//	}
	
	
	
	@RequestMapping("joinOk")
	public String joinOk(@ModelAttribute("jdto") JoinDto JoinDto) { //별칭쓰려면 JoinDto JoinDto 같아야 함 !!
		
		
		return "joinOk";
		
	}
	
	
	
	
	
	
	
	

}
