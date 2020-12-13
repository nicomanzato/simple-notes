package com.example.easynotes.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.easynotes.model.*;
import com.example.easynotes.repository.NotebookRepository;

public class NotebookService {
	
	SessionFactory sessionFactory;
	
    NotebookRepository notebookRepository;
	
	public NotebookDTO findNotebook() {
		
		Session session = this.sessionFactory.openSession();
				
		Notebook notebook = notebookRepository.findNotebook(session);
		
		NotebookDTO notebookDTO = new NotebookDTO(notebook);
		
		session.close();

		return notebookDTO;
	}
	
	public void addNote(Note note) {
				
		Session session = this.sessionFactory.openSession();
				
		Notebook notebook = notebookRepository.findNotebook(session);
		
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
				
		Session session = this.sessionFactory.openSession();
				
		Notebook notebook = notebookRepository.findNotebook(session);
		
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
