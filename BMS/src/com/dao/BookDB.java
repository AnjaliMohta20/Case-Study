package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB {

	public static Connection getConnection() 
		throws Exception{
		String DriverName="org.postgresql.Driver";
		Class.forName(DriverName);
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","anjanina"+"");
		
		return con;
	}

}