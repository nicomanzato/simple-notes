package com.example.easynotes.controllers;

import com.example.easynotes.model.*;
import com.example.easynotes.services.NotebookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class NoteController {
	
	@Autowired
	NotebookService notebookService;

    @GetMapping("/notes")
    public Set<NoteDTO> fetchAllNotes() {
    	  
    	NotebookDTO notebook = notebookService.findNotebook();
    	    	
        return notebook.getNotes();
    }
    
    @GetMapping("/addNote")
    public void addNote() {
    	
    	Note note = new Note();
    	
    	note.setTitle("Hola");
    	note.setContent("Mundo!");
    	  
    	notebookService.addNote(note);
    }
    
    @GetMapping("/deleteNote")
    public void deleteNotebook(@RequestParam(required = true) String id) {
    	  
    	notebookService.deleteNote(Long.valueOf(id));
    }
    
    @GetMapping("/notebook")
    public long getNotebook() {
    	  
    	NotebookDTO notebook = notebookService.findNotebook();
    	    	
        return notebook.getId();
    }

	public NotebookService getNotebookService() {
		return notebookService;
	}

	public void setNotebookService(NotebookService notebookService) {
		this.notebookService = notebookService;
	}
}