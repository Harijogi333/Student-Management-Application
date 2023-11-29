package com.sma.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;
	
	public static Connection createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="Hari@333";
			String url="jdbc:mysql://localhost:3306/StudentMApp";
			con=DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}
