package com.service;

import com.dao.BookDAO;
import com.entity.Book;

public class BookService {
	
	public int addBookService(int Bid,String Btitle,float Bprice) {
		String Bgrade="";
		if(Bprice<=300) {
			Bgrade="C";
		}
		else if(Bprice<=600) {
			Bgrade="B";
		}
		else {
			Bgrade="A";
		}
		
		BookDAO bdao=new BookDAO();
		Book book=new Book();
		book.setBid(Bid);
		book.setBtitle(Btitle);
		book.setBprice(Bprice);
		book.setBgrade(Bgrade);
		
		int updateResult= 0;
		try {
			updateResult=bdao.addBook(book);
			return updateResult;
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			return 0;
		}

	}

}