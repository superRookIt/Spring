package com.javalec.e;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping(value = "event/eventlist")
	public String eventlist(HttpServletRequest request, Model model) {

		//String contextPath = request.getContextPath();
		String id = "admin";
		// request.getParameter("id");
		model.addAttribute("id", id);

		return "event/eventlist";
	}

}
