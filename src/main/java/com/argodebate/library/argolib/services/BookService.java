package com.argodebate.library.argolib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argodebate.library.argolib.entities.Book;
import com.argodebate.library.argolib.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public void saveBook(Book book) {
		bookRepository.save(book);
	}
}
