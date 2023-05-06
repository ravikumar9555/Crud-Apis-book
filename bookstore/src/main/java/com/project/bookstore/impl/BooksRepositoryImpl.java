package com.project.bookstore.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import com.project.bookstore.entities.Books;
import com.project.bookstore.repository.BooksRepository;
import com.project.bookstore.service.BooksService;

@Service
public class BooksRepositoryImpl implements BooksService{

	@Autowired
	@Lazy
	private  BooksRepository booksRepository;
	@Override
	public Books createBook(Books books) {
		// TODO Auto-generated method stub
		return this.booksRepository.save(books);
	}

	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return this.booksRepository.findAll();
	}



	@Override
	public void deleteBook(Integer booksId) {
		this.booksRepository.deleteById(booksId);
		
	}

	@Override
	public Books updateBooK(Integer booksId, Books books) {
		Books book=this.booksRepository.findById(booksId).orElseThrow();
		book.setBookname(books.getBookname());
		book.setDescription(books.getDescription());
		book.setPrice(books.getPrice());
		return null;
	}

	@Override
	public Books getBooksById(Integer booksId) {
		Books book=this.booksRepository.findById(booksId).orElseThrow();
		
		return book;
	}

//	@Override
//	public Books getBooksById(Integer booksId) {
//		Optional<Books> book=this.booksRepository.findById(booksId);
//		return this.getBooksById(booksId);
//	}
//	
	
	

}
