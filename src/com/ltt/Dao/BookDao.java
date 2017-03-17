package com.ltt.Dao;

import java.util.List;

import com.ltt.entiry.Book;

public interface BookDao {
	
	public void addBook(Book b);//Ìí¼Ó
	public int  updateBook();//ÐÞ¸Ä
	public int deleteBook();//É¾³ý
	public List<Book> queryAll();//²éÑ¯

}
