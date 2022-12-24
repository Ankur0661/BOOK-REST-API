package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.book.repository.BookRepo;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo br;
	
	@Override
	public Book createNewBook(Book book) {
		// TODO Auto-generated method stub
		
		return br.save(book);
		
	}

	@Override
	public String deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
		Optional<Book> bk = br.findById(bookId);
		
		if(bk.isPresent()) {
			br.deleteById(bookId);
			return "Delete book Susessfully";
		}else {
			return "book not found";
		}
		
	}

	@Override
	public String updateBook(int bookId) {
		// TODO Auto-generated method stub
		
		Optional<Book> bk = br.findById(bookId);
		
		if(bk.isPresent()) {
			br.save(bk.get());
			return "update Succesfully";
		}else {
			return "Book not found";
		}
		
	}

	@Override
	public List<Book> getAllBook(Book book) {
		
		List<Book> bk = br.findAll();
		return bk;
	}

	@Override
	public Book findByBookById(int bookId) {
		// TODO Auto-generated method stub
		
		Optional<Book> bk= br.findById(bookId);
		
		if(bk.isPresent()) {
			
			return bk.get();
		}
		
		return null;
	}

}
