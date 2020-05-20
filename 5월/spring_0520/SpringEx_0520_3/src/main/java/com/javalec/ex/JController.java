package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JController {
	
	
	@RequestMapping("join")
	public String join() {
		
		
		return "join";
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, value="joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		
		
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		model.addAttribute("address", address);
		model.addAttribute("tel", tel);
		model.addAttribute("birth", birth);
		
		
		return "joinOk";
		
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="joinOk")
	public ModelAndView mv(HttpServletRequest request) {
		
		
		ModelAndView mv = new ModelAndView();
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		
		mv.addObject("num", num);
		mv.addObject("name", name);
		mv.addObject("address", address);
		mv.addObject("tel", tel);
		mv.addObject("birth", birth);
		
		mv.setViewName("joinOk"); // ★
		
		return mv;
		
		
	}
	
	
	
	
	
	
	
	
	

}
