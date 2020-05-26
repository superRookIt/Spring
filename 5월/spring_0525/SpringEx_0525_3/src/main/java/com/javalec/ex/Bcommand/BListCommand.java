package com.javalec.ex.Bcommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {

		BDao dao = new BDao();

		ArrayList<BDto> dtos = dao.list();

		model.addAttribute("list", dtos);

	}

}
