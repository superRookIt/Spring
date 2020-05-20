package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	
	@RequestMapping("board/form")
	public String form() {

		return "board/form";

	}

	
	
	@RequestMapping(method = RequestMethod.POST, value="board/formOk")
	public String formOk(HttpServletRequest request, Model model) { // 매개변수 2개

		// form의 id, pw의 값이 request 안으로 넘어옴

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		// model에 값을 넣어줌

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/formOk";

	}
	
	
	
	
	@RequestMapping(method = RequestMethod.GET, value="board/formOk")
	public ModelAndView formOk(HttpServletRequest request) { // 매개변수 1개

		ModelAndView mv = new ModelAndView();

		String pw = request.getParameter("pw");
		String id = request.getParameter("id");

		mv.addObject("id", id);
		mv.addObject("pw", pw);

		mv.setViewName("board/formOk");
		
		return mv;

	}
	
	
	

	
	
	
	
	
	




}
