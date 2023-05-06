package com.project.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.bookstore.entities.Books;

@Service
public interface BooksService {

	//create book
	
	Books createBook(Books books);
	
	//get all book
	List<Books> getAllBooks();
	
	//get single book
	
	Books getBooksById(Integer booksId);
	
	//update book
	Books updateBooK(Integer booksId,Books books);
	
	//delete book
	public void deleteBook(Integer booksid);
	
}
