package com.project.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookstore.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
