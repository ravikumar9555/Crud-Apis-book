package com.project.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.bookstore.entities.Books;
import com.project.bookstore.impl.BooksRepositoryImpl;





@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	@Lazy
	 BooksRepositoryImpl booksRepositoryImpl;
	
	//get books
	@PostMapping("/")
	public ResponseEntity<Books>  createCategory( @Validated @RequestBody Books book)
	{
		Books createCategory = this.booksRepositoryImpl.createBook(book);
	return new ResponseEntity<Books>(book,HttpStatus.CREATED);
		
	}
	//get
		@GetMapping("/")
		public ResponseEntity<List<Books>> getBooks(){
		
			List<Books> book = this.booksRepositoryImpl.getAllBooks();
		return ResponseEntity.ok(book);
		}
		
		//delete
		@DeleteMapping("/{bookId}")
		public ResponseEntity<com.project.bookstore.payload.ApiResponse> deleteCategory(@PathVariable Integer bookId){
			this.booksRepositoryImpl.deleteBook(bookId);
			return new ResponseEntity<com.project.bookstore.payload.ApiResponse>(new com.project.bookstore.payload.ApiResponse("Successfully deleted !!", true),HttpStatus.OK);
		}
		@GetMapping("/{bookId}")
		public ResponseEntity<Books> getCategory(@PathVariable Integer bookId){
			Books book = this.booksRepositoryImpl.getBooksById(bookId);
			return new ResponseEntity<Books>(book,HttpStatus.OK);
		}
		//update
		@PutMapping("/{bookId}")
		public ResponseEntity<Books>  updateBook(@Validated @RequestBody Books book, @PathVariable Integer bookId)
		{
			Books books = this.booksRepositoryImpl.updateBooK(bookId, book);
		return new ResponseEntity<Books>(books,HttpStatus.OK);
			
		}
}
