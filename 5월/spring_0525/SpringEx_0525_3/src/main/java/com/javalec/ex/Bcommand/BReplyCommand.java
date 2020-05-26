package com.javalec.ex.Bcommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId= request.getParameter("bId");
		
		BDao dao = new BDao();
		
		BDto dto = dao.reply(bId);
		
		model.addAttribute("reply", dto);
		
		
	}

}
