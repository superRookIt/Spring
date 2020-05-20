package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {
	
	
	@RequestMapping("form")
	public String form() {
		
		
		
		return "form";
	}
	
	
	
//	@PostMapping("formOk") //post 방식
//	// @GetMapping
//	public String formOk(HttpServletRequest request, Model model) {
//		
//		
//		model.addAttribute("id",request.getParameter("id"));
//		model.addAttribute("pw",request.getParameter("pw"));
//		
//		
//		return "formOk";
//	}

	
	
	
	@PostMapping("formOk") //post 방식
	public String formOk(@ModelAttribute("stu") Student student) {
		
		return "formOk";
	}
	
	
	
	@RequestMapping("checkOk")
	public String checkOk(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		
		if(id.equals("naver_admin")) {
			
			model.addAttribute("id",id);
			model.addAttribute("pw", request.getParameter("pw"));
			
			return "redirect:loginOk";
			
		} else {
			
			return "redirect:loginFail";
			
		}
		
	}
	
	
	
	@PostMapping("loginOk") 
	public String loginOk() {
		
		return "loginOk";
	}
	
	
	
	@PostMapping("loginFail") 
	public String loginFail() {
		
		return "loginFail";
	}
	
	
	
	

}
