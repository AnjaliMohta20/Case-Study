package com.ui;

import java.util.Scanner;

import com.dao.BookDAO;
import com.service.BookService;

public class BookUI {
	
	public static void main(String[] args)  {
		int Bid=0;
		String Btitle;
		float Bprice;
		Scanner sc= new Scanner(System.in);
		int option;
		while(true) {
		System.out.println("BOOK MANAGENT SYSTEM");
		System.out.println("Enter you choice:");
		System.out.println("1. Add Book");
		System.out.println("2. Get Book Details");
		System.out.println("3. Exit");
		option=sc.nextInt();
		switch(option) {
		
		case 1:{
			System.out.println("Enter Book Id");
			Bid=sc.nextInt();
			System.out.println("Enter Book Title");
			Btitle=sc.next();
			System.out.println("Enter Book Price");
			Bprice=sc.nextFloat();
			BookService bookservice=new BookService();
			int updateCount=bookservice.addBookService(Bid, Btitle, Bprice);
			System.out.println("Inserted Record "+updateCount+" Record Success");
			break;
		}
		
		case 2:
		{
			BookDAO bookdao=new BookDAO();
			System.out.println("Enter Id of the book");
			try {
			bookdao.getbyID(Bid);
			}
			catch( Exception ex ) {
				System.out.println(ex.toString());
			}
		}
		
		case 3:{
			System.exit(0);
		}
		
		default:
			System.out.println("Wrong Selection");
			
	}
	}

	}
}


