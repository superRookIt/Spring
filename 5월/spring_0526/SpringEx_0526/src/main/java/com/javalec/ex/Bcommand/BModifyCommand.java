package com.javalec.ex.Bcommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.Dao.BDao;
import com.javalec.ex.Dto.BDto;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();

		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bId = request.getParameter("bId");

		BDao dao = new BDao();

		BDto dto = dao.modify(bId);

		model.addAttribute("modify", dto);

	}

}
