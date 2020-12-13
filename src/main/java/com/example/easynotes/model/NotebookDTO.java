package com.example.easynotes.model;

import java.util.HashSet;
import java.util.Set;

public class NotebookDTO {

	public long id;
	
	public Set<NoteDTO> notes;
	
	public NotebookDTO(Notebook notebook) {
		this.setId(id);
		
		this.setNotes(new HashSet<NoteDTO>());
		notebook.getNotes().forEach(note -> this.addNote(new NoteDTO(note)));
	}

	private void addNote(NoteDTO note) {
		this.notes.add(note);
	}

	public Set<NoteDTO> getNotes() {
		return notes;
	}

	private void setNotes(Set<NoteDTO> notes) {
		this.notes = notes;
	}

	public long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}
}
