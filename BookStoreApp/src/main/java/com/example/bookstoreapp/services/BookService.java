package com.example.bookstoreapp.services;

import java.util.List;

import com.example.bookstoreapp.entities.Book;


public interface BookService {
	 public String AddBook(Book b);
     public List<Book> GetAllBookInfo();
     public String UpdateBook(Book b);
     public String DeleteBook(int book_Id);
}
