package com.eoot.blogprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {
	
	@RequestMapping("/note")
	public String note(){
		
		return "blog/note/note";
	}
}
