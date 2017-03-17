package com.ltt.Dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltt.Dao.BookDao;
import com.ltt.entiry.Book;
import com.oraclae.util.ADSU;

public class Bookimp extends ADSU implements BookDao{

	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		String sql = "insert into book values (?,?,?,?,?)";  
		int i=this.update(sql,b.getBid(),b.getBname(),b.getBprice(),b.getBtype(),b.getBtime());
		if(i==1){
			System.out.println("添加成功");
		}else{
		System.out.println("添加失败");
		}
	}

	@Override
	public int updateBook() {
		// TODO Auto-generated method stub
		String sql="update book set bprice=bprice*0.8 where btype='小说类'";  
		int i=this.update(sql);  
		if(i==1){
			System.out.println("更新成功");
		} else{
			System.out.println("更新失败");
		}     
		return 0;
	}

	@Override
	public int deleteBook() {
		// TODO Auto-generated method stub
		String sql="delete from book where bprice<=40 and btime='2016-7-7'"; 
		int i=this.update(sql);                              
		return i;
	}

	@Override
	public List<Book> queryAll() {
		// TODO Auto-generated method stub
		String sql="select avg(bprice),btype from book  group by btype";
		System.out.println("平均价格\t类型");
		ArrayList<Book> list= this.query(sql);                           
		return list;                                                     
		                                                                 
	}

	@Override
	public ArrayList<Book> getDataFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Book> list=new ArrayList<Book>(); 
		while(rs.next()){	                        
			Book b=new Book();     
			b.setBprice(rs.getDouble(1));    
			b.setBtype(rs.getString(2));           
			list.add(b);                            
		}                                           
		return list;                                
	}

}
