package com.ltt.Dao;

import java.util.List;

import com.ltt.entiry.Book;

public interface BookDao {
	
	public void addBook(Book b);//���
	public int  updateBook();//�޸�
	public int deleteBook();//ɾ��
	public List<Book> queryAll();//��ѯ

}
