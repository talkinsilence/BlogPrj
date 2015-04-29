package com.eoot.blogprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact(){
		
		return "blog/contact/contact";
	}
}
