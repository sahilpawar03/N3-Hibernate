package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookService {
			//abstract method
			List<Book>getAll();
			List<Book>getBooksAuthor(String author);
			List<Book>getPrice(Float low,Float high);
			Book getBookByIds(Integer id);
			Long getCount();
}
