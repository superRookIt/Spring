package com.javalec.ex.Bcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Bcommand.BContentCommand;
import com.javalec.ex.Bcommand.BListCommand;
import com.javalec.ex.Bcommand.BWriteCommand;
import com.javalec.ex.Bcommand.Bcommand;
import com.javalec.ex.Util.Constant;

@Controller
public class Bcontroller {

	
	public JdbcTemplate template;
	
	
	@Autowired // autoscan. 빈이 만들어질때 바로 setting
	public void setTemplate(JdbcTemplate template) {
		this.template = template; // template을 전역적으로 사용하기 위해 Constant 파일을 만듬
		Constant.template = this.template;
	}

	
	Bcommand bcom = null;

	
	
	@RequestMapping("list")
	public String list(Model model) {

		bcom = new BListCommand();
		bcom.execute(model);

		return "list";

	}
	
	

	@RequestMapping("write")
	public String write(Model model) {

		bcom = new BWriteCommand();
		bcom.execute(model);

		return "write";

	}
	
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		
		model.addAttribute("request", request);
		
		bcom = new BContentCommand();
		bcom.execute(model);
		
		return "content_view";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
