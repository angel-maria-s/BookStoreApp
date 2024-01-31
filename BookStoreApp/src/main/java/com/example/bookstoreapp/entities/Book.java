package com.example.bookstoreapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	int book_Id;
	String bookname;
	String author;
	int cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int book_Id, String bookname, String author, int cost) {
		super();
		this.book_Id = book_Id;
		this.bookname = bookname;
		this.author = author;
		this.cost = cost;
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", bookname=" + bookname + ", author=" + author + ", cost=" + cost + "]";
	}
		
}
