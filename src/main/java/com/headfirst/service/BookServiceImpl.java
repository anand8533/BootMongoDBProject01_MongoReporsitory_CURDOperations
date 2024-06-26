package com.headfirst.service;

import com.headfirst.entity.Book;
import com.headfirst.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("dockService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void publishBookService(Book newBook) {

		String dockID = bookRepository.save(newBook).getId();

		System.out.println(dockID + " document ID");


	}

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();

	}

	@Override
	public Optional<Book> findByAuthor(String author) {
		return bookRepository.findById(author);
	}
}
