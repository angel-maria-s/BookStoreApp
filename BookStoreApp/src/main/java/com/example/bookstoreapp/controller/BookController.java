package com.example.bookstoreapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstoreapp.entities.Book;
import com.example.bookstoreapp.services.BookService;


@Controller
public class BookController {

	BookService bserv;

	public BookController(BookService bserv) {
		super();
		this.bserv = bserv;
	}
	
	@GetMapping("/map-add")
    public String mapAdd() {
  	  return "AddBook";
    }
	
	@PostMapping("/addbook")
    public String AddBook(@ModelAttribute Book b) {
    	String msg=bserv.AddBook(b);
    	return msg;
    }
	
	 @GetMapping("/view")
     public String GetAllBookInfo(Model model){
   	  List<Book> bklist=bserv.GetAllBookInfo();
   	  model.addAttribute("Books",bklist);
   	  return "ViewBooks"; 
     }
	 
	 @GetMapping("/map-update")
     public String mapUpdate() {
   	  return "UpdateBook";
     }

     @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.POST})
     public String UpdateBook(@ModelAttribute Book b) {
         String msg = bserv.UpdateBook(b);
         return msg;
     }

     @GetMapping("/map-delete")
     public String mapDelete() {
   	  return "DeleteBook";
     }
     @RequestMapping(value = "/delete/{rollNo}", method = {RequestMethod.DELETE, RequestMethod.POST} )
     public String DeleteBook(int book_Id) {
         String msg = bserv.DeleteBook(book_Id);
         return msg;
     }

}
