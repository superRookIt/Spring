package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	//http://localhost:8181/ex/path/~(데이터 다)
	
	@RequestMapping("path/{pathViewNum}")
	public String pathView(@PathVariable String pathViewNum, Model model) {

		model.addAttribute("pathViewNum", pathViewNum);
		
		return "path/pathView";
		
	}

}
