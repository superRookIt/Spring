package com.javalec.ex.Bcommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BReplyOkCommand implements BCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();

		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");

		BDao dao = new BDao();

		dao.reply_ok(bId, bName, bTitle, bContent, bGroup, bStep, bIndent);

	}

}
