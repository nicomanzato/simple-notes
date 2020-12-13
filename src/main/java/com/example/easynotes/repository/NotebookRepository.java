package com.example.easynotes.repository;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;
import com.example.easynotes.model.Notebook;

public class NotebookRepository {
	
	public Notebook findNotebook(Session session) {
		
		Notebook notebook;
		
		Query query = session.createQuery("from Notebook");
		query.setMaxResults(1);
		
		notebook = (Notebook) query.getSingleResult();
		
		

		return notebook;
		
	}
	
	public Note findNoteById(Session session, long noteId) {
		
		Note note;
		
		Query query = session.createQuery("from Note note where note.id=:id");
		query.setParameter("id", noteId);
		
		query.setMaxResults(1);
		
		note = (Note) query.getSingleResult();
		
		

		return note;
		
	}
	
}
