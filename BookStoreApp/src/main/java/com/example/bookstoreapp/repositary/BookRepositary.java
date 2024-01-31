package com.example.bookstoreapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstoreapp.entities.Book;

public interface BookRepositary extends JpaRepository<Book,Integer>{

}
