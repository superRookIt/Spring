package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Bcommand.BCommand;
import com.javalec.ex.Bcommand.BContentCommand;
import com.javalec.ex.Bcommand.BDeleteCommand;
import com.javalec.ex.Bcommand.BListCommand;
import com.javalec.ex.Bcommand.BModifyCommand;
import com.javalec.ex.Bcommand.BModifyOkCommand;
import com.javalec.ex.Bcommand.BReplyCommand;
import com.javalec.ex.Bcommand.BReplyOkCommand;
import com.javalec.ex.Bcommand.BWriteCommand;
import com.javalec.ex.Util.Constant;

@Controller
public class BController {

	
	JdbcTemplate template;

	
	@Autowired
	private SqlSession sqlsession;
	
	//Autowired 1 변수, 2 setter, 3 생성자
	
	 
	@Autowired // servlet에서 가져옴 
	public void setTemplate(JdbcTemplate template) {
		
		this.template = template;
		
		Constant.template = this.template;
		
	}
	
	
	BCommand bcom;
	
	
	
	@RequestMapping("list")
	public String list(Model model) {
		//mybatis에 있는 객체를 가져 옴
		bcom = new BListCommand();
		
		bcom.execute(model);
		
		return "list";
	
	}
	
	
	
	
	@RequestMapping("write_view")
	public String write_view(Model model) {
		
		return "write_view"; //form 화면
		
	}
	
	
	
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model){

		model.addAttribute("request", request);
		
		bcom = new BWriteCommand();
		
		bcom.execute(model);

		return "redirect:list";

	}
	
	
	
	@RequestMapping("content_view") //list->제목을 클릭
	public String content_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BContentCommand();

		bcom.execute(model);

		return "content_view";

	}

	
	
	@RequestMapping("modify") 
	
	public String modify(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BModifyCommand();

		bcom.execute(model);

		return "modify_view";

	}
	
	
	@RequestMapping("modify_ok")

	public String modify_ok(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BModifyOkCommand();

		bcom.execute(model);

		return "redirect:list";

	}
	
	
	
	
	@RequestMapping("reply")
	public String reply_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);
		bcom = new BReplyCommand();
		bcom.execute(model);

		return "reply_view";
	}
	

	
	
	
	@RequestMapping("reply_ok")
	public String reply_ok(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);
		bcom = new BReplyOkCommand();
		bcom.execute(model);

		return "redirect:list";
	}
	
	
	
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);
		bcom = new BDeleteCommand();
		bcom.execute(model);

		return "redirect:list";
	}

	


}
