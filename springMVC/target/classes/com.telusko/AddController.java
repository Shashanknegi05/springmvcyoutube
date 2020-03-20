package com.telusko;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public String add() {	
		System.out.println("I m inside controller now");
		return "display.jsp";
	}

}
