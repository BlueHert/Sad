package com.oraclae.util;

import java.util.List;
import java.util.Scanner;

import com.ltt.Dao.imp.Bookimp;
import com.ltt.entiry.Book;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(5, "Ʈ", 50.0, "С˵��", "2016-7-7");
		Bookimp b=new Bookimp();
		b.addBook(book);
		Scanner cout=new Scanner(System.in);
		System.out.println("�Ƿ���в�����(y/n)");
		String input=cout.next();
		do{
		System.out.println("ѡ��1.��ѯ"+"\t2.�޸�\t"+"3.ɾ��");
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
				System.out.println("ɾ���¹�");
			}  else{
				System.out.println("ɾ��ʧ��");
			}    
			break;
			default:
				System.out.println("��������");
		}
		System.out.println("�Ƿ��������y/n��");
		 input=cout.next();
		}while(input.equals("y"));
	}

}
