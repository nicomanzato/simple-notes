package com.example.easynotes.model;

import java.util.Date;

public class NoteDTO {
    private Long id;

    private String title;

    private String content;

    private Date createdAt;

    private Date updatedAt;
    
    public NoteDTO(Note note) {
    	this.setId(note.getId());
    	this.setCreatedAt(note.getCreatedAt());
    	this.setTitle(note.getTitle());
    	this.setContent(note.getContent());
    	this.setUpdatedAt(note.getUpdatedAt());
    }
    
    public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	
	private void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	private void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
