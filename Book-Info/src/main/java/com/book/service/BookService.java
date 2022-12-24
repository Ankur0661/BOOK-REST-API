package com.book.service;

import java.util.List;



import com.book.model.Book;


public interface BookService {
	
	public Book createNewBook(Book book);
	
	public String deleteBook(int bookId);
	
	public String updateBook(int bookId);
	
	public List<Book> getAllBook(Book book);
	
	public Book findByBookById(int bookId);

}
