package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentViewCommand;
import com.javalec.ex.BCommand.BListCommand;
import com.javalec.ex.BCommand.BWriteCommand;
import com.javalec.ex.Unit.Constant;

@Controller
public class Bcontroller {

	public JdbcTemplate template;

	BCommand bcom = null;

	@Autowired // ★
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("list")
	public String list(Model model) {

		bcom = new BListCommand();
		bcom.execute(model);

		return "list";

	}

	@RequestMapping("login")
	public String login() {

		return "login";

	}
	
	

	@RequestMapping("view")
	public String view() {

		return "view";

	}

	@RequestMapping("write")
	public String write() {

		return "write";

	}

	@RequestMapping("write_ok")
	public String write_ok(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BWriteCommand();

		bcom.execute(model);

		return "redirect:list";

		// 그냥 list를 하면 list가 안불러와짐 redirect를 붙여야 함

	}

	
	
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		bcom= new BContentViewCommand();
		
		bcom.execute(model);
		
		return "content_view";

	}
	
	
	
	
	
	
	
	
	
	
	

}
