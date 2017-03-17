package com.oraclae.util;

import java.util.List;
import java.util.Scanner;

import com.ltt.Dao.imp.Bookimp;
import com.ltt.entiry.Book;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(5, "飘", 50.0, "小说类", "2016-7-7");
		Bookimp b=new Bookimp();
		b.addBook(book);
		Scanner cout=new Scanner(System.in);
		System.out.println("是否进行操作？(y/n)");
		String input=cout.next();
		do{
		System.out.println("选择：1.查询"+"\t2.修改\t"+"3.删除");
		int i=cout.nextInt();
		switch(i){
		case 1:
			List<Book> list1=b.queryAll();
			for (Book book1 : list1) {
				System.out.println(book1);
			}
			break;
		case 2:
			b.updateBook();
			break;
		case 3:
			int j=b.deleteBook();
			if(j==1){
				System.out.println("删除陈功");
			}  else{
				System.out.println("删除失败");
			}    
			break;
			default:
				System.out.println("输入有误");
		}
		System.out.println("是否继续？（y/n）");
		 input=cout.next();
		}while(input.equals("y"));
	}

}
