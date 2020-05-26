package com.javalec.ex.BController;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Bcommand.BCommand;
import com.javalec.ex.Bcommand.BContentCommand;
import com.javalec.ex.Bcommand.BDeleteCommand;
import com.javalec.ex.Bcommand.BListCommand;
import com.javalec.ex.Bcommand.BReplyCommand;
import com.javalec.ex.Bcommand.BReplyOkCommand;
import com.javalec.ex.Bcommand.BWriteCommand;
import com.javalec.ex.Util.Constant;

@Controller
public class BController {

	JdbcTemplate template;

	@Autowired //
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	BCommand bcom = null;

	@RequestMapping("list")
	public String list(Model model) {

		bcom = new BListCommand();
		bcom.execute(model);

		return "list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		bcom = new BContentCommand();

		bcom.execute(model);

		return "content_view";

	}

	@RequestMapping("write_view")
	public String write_view() {

		return "write_view";

	}

	
	// public String write(@RequestParam("bTitle") String bTitle , Model model)
	// public String write(Bdto bdto , Model model)
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model){

		model.addAttribute("request", request);
		bcom = new BWriteCommand();
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
	
	
	
	

}
