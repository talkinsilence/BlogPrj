package com.eoot.blogprj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eoot.blogprj.dao.mybatis.NoteDaoImpl;
import com.eoot.blogprj.model.Note;

@Controller
public class NoteController {
	
	@Autowired
	private NoteDaoImpl noteDaoImpl;
	
	@RequestMapping("/note")
	public String note(Model model){
		List<Note> notes = noteDaoImpl.getNotes();
		
		model.addAttribute("notes", notes);
		
		return "blog/note/note";
	}
	
	@RequestMapping("/noteDetail")
	public String getNote(){
	
		return "blog/note/noteDetail";
	}
}
