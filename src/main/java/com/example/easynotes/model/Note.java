package com.example.easynotes.model;
import java.io.Serializable;
import java.util.Date;
 
public class Note implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String content;

    private Date createdAt;

    private Date updatedAt;
    
    public Note() {
    	this.setCreatedAt(new Date());
    }
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.setUpdatedAt(new Date());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setUpdatedAt(new Date());
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