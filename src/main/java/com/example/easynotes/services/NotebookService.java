package com.example.easynotes.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;
import com.example.easynotes.model.Notebook;
import com.example.easynotes.repository.NotebookRepository;

public class NotebookService {
	
	SessionFactory sessionFactory;
	
    NotebookRepository notebookRepository;
	
	public Notebook findNotebook() {
		Notebook notebook;
		
		Session session = this.sessionFactory.openSession();
				
		notebook = notebookRepository.findNotebook(session);
		
		session.close();

		return notebook;
	}
	
	public void addNote(Note note) {
		
		Notebook notebook;
		
		Session session = this.sessionFactory.openSession();
				
		notebook = notebookRepository.findNotebook(session);
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			notebook.addNote(note);
			
			tx.commit();
			
		}
		finally {
			session.close();
		}		
		
	}
	
	public void deleteNote(long noteId) {
		
		Notebook notebook;
		
		Session session = this.sessionFactory.openSession();
				
		notebook = notebookRepository.findNotebook(session);
		
		Note note = notebookRepository.findNoteById(session, noteId);
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			notebook.removeNote(note);
			
			tx.commit();
			
		}
		finally {
			session.close();
		}		
		
	}

	public NotebookRepository getNotebookRepository() {
		return notebookRepository;
	}

	public void setNotebookRepository(NotebookRepository notebookRepository) {
		this.notebookRepository = notebookRepository;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
