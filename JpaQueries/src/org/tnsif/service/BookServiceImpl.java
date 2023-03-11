package org.tnsif.service;

import java.util.List;
import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;
import org.tnsif.entities.Book;


public class BookServiceImpl implements BookService{
private BookDao dao;
	

	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAll() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.getBooks(author);
	}

	@Override
	public List<Book> getPrice(Float low, Float high) {
		// TODO Auto-generated method stub
		return dao.getPriceRange(low, high);
	}

	@Override
	public Book getBookByIds(Integer id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}



}
