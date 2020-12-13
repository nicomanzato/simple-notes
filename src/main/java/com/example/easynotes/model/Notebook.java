package com.example.easynotes.model;

import java.util.Set;

public class Notebook {
	
	public long id;
	
	public Set<Note> notes;

	public void addNote(Note note) {
		this.notes.add(note);
	}
	
	public void removeNote(Note note) {
		this.notes.remove(note);
	}

	public Set<Note> getNotes() {
		return notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
