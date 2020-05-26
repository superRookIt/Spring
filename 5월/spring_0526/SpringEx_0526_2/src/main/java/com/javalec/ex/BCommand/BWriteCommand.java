package com.javalec.ex.BCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		BDao dao = new BDao();
		
		String bname = request.getParameter("bname");
		
		String btitle = request.getParameter("btitle");
		
		String bcontent = request.getParameter("bcontent");
		
		dao.write(bname, btitle, bcontent);
		
		

	}

}
