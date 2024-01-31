package com.example.bookstoreapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entities.Book;
import com.example.bookstoreapp.repositary.BookRepositary;


@Service
public class BookServiceImplementation implements BookService {

	BookRepositary brepo;
	
	public BookServiceImplementation(BookRepositary brepo) {
		super();
		this.brepo = brepo;
	}

	@Override
	public String AddBook(Book b) {
		brepo.save(b);
		return "AddBookSucess";
	}

	@Override
	public List<Book> GetAllBookInfo() {
		List<Book> blist= brepo.findAll();
		return blist;
	}

	@Override
	public String UpdateBook(Book b) {
		brepo.save(b);
		return "UpdateBookSucess";
	}

	@Override
	public String DeleteBook(int book_Id) {
		brepo.deleteById(book_Id);
		return "DeleteBookSucess";
	}

}
