package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Book;

public class BookDAO {

	public int addBook(Book book) {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=BookDB.getConnection();
			String input="insert into book values(?,?,?,?)";
			stmt=con.prepareStatement(input);
			stmt.setInt(1, book.getBid());
			stmt.setString(2, book.getBtitle());
			stmt.setFloat(3, book.getBprice());
			stmt.setString(4, book.getBgrade());
			int updateResult=stmt.executeUpdate();
			con.close();
			return updateResult;
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
			return 0;
		}
	}
	public ArrayList getbyID(int Bid) throws Exception{
		
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		con=BookDB.getConnection();
		
		String sel_input="Select btitle,bprice,bgrade where bid=?";
		stmt=con.prepareStatement(sel_input);
		stmt.setInt(1,Bid);
		rs=stmt.executeQuery();
		ArrayList result=new ArrayList();
		if(rs.next()) {
			result.add(rs.getString(1));
			result.add(rs.getString(2));
			
		}
		else {
			result.add("Invalid Id");
		}
		return result;
				
		}
		
	}
