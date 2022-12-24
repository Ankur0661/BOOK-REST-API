package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bs;
	
	@GetMapping("/welcome")
	public String welcomeBookDetails() {
		
		return "Welcome to book Stores";
	}
	
	
	@PostMapping("/addBook")
	public ResponseEntity<Book> addNewBook(@RequestBody Book book){
		
		Book bk = bs.createNewBook(book);
		
		return new ResponseEntity<Book>(bk, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/removeBook/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") int id){
		
		return new ResponseEntity<String>(bs.deleteBook(id), HttpStatus.OK);
	}
	
	@PutMapping("/updateBook/{bookId}")
	public ResponseEntity<String> updateBook(@PathVariable("bookId") int id){
		
		return new ResponseEntity<String>(bs.updateBook(id), HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/getAllBook")
	public ResponseEntity<List<Book>> getAllBook(@RequestBody Book book){
		
		List<Book> bk = bs.getAllBook(book);
		return new ResponseEntity<List<Book>>(bk, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findBook/{bookId}")
	public ResponseEntity<Book> findBookById(@PathVariable("bookId") int id){
		
		Book bk = bs.findByBookById(id);
		return new ResponseEntity<Book>(bk, HttpStatus.OK);
	}
}
