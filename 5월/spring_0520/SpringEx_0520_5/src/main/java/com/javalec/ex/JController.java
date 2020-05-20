package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JController {
	
	
	
	@RequestMapping("formOk1")
	public String formOk1(HttpServletRequest request, Model model) {
		
		
		int num = Integer.parseInt(request.getParameter("num"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String date = request.getParameter("date");
		String group = request.getParameter("group");
		int step = Integer.parseInt(request.getParameter("step"));
		int indent = Integer.parseInt(request.getParameter("indent"));
		
		
		model.addAttribute("num",num);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("date", date);
		model.addAttribute("group", group);
		model.addAttribute("step", step);
		model.addAttribute("indent", indent);
		
		
		return "formOk1";
		
	}
	
	
	
	
	@RequestMapping("formOk2")
	public String formOk2(Form form) {
		
		
		return "formOk2";
	}
	
	
	
	
	@RequestMapping("formOk3")
	public String formOk3(@RequestParam("num") int num, 
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			@RequestParam("date") String date,
			@RequestParam("group") String group,
			@RequestParam("step") int step,
			@RequestParam("indent") int indent,
			Model model) {
		
		
		model.addAttribute("num",num);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("date", date);
		model.addAttribute("group", group);
		model.addAttribute("step", step);
		model.addAttribute("indent", indent);
		
		
		return "formOk3";
		
	}

	
	
	
	@RequestMapping("form1")
	public String form1() {
		
		
		return "form1";
	}
	
	
	
	
	@RequestMapping("form2")
	public String form2() {
		
		
		return "form2";
	}
	
	
	
	
	@RequestMapping("form3")
	public String form3() {
		
		
		return "form3";
	}
	
	
	
	

}
