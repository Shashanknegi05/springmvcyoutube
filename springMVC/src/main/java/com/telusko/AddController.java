package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping(value ="/add")
	public String add() {	
		System.out.println("I m inside controller now");
		return "display.jsp";
	}

}
