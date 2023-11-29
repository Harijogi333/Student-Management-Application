package com.sma.dao;

import com.sma.model.Student;
import com.sma.db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class StudentDao implements StudentDaoInterface {

	@Override
	public void showAllStudent() {
		try
		{
			Connection con=DBConnection.createConnection();
			String query="select * from student";
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery(query);
			while(r.next())
			{
				System.out.println("Roll Number:"+r.getInt(1)+
						          "\nName:"+r.getString(2)+
						           "\nClg Name:"+r.getString(3)+
						           "\nCity:"+r.getString(4)+
						           "\nPercentage:"+r.getDouble(5));
				System.out.println("----------------\n");
			}
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public boolean insert(Student s) {
		boolean flag=false;
		try
		{
			Connection con=DBConnection.createConnection();
			PreparedStatement ps=con.prepareStatement("insert into student(sname,clgName,city,percentage) values(?,?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2, s.getClgName());
			ps.setString(3,s.getCity());
			ps.setDouble(4,s.getPercentage());
			ps.executeUpdate();
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}

	@Override
	public boolean delete(int roll) {
		boolean flag=false;
		try
		{
			Connection con=DBConnection.createConnection();
			String query="delete from student where rollno="+roll;
			PreparedStatement ps=con.prepareStatement(query);
			int n=ps.executeUpdate();
			if(n==1)
				flag=true;	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}

	@Override
	public boolean update(int roll, String update, int ch, Student s)
	{
		boolean flag=false;
		try
		{
			
			if(ch==1)
			{
				Connection con=DBConnection.createConnection();
				String query="update student set sname=? where rollno=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,update);
				ps.setInt(2, roll);
				int n=ps.executeUpdate();
				if(n>=1)
					flag=true;	
			}
			else if(ch==2)
			{
				Connection con=DBConnection.createConnection();
				String query="update student set clgName=? where rollno=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,update);
				ps.setInt(2, roll);
				int n=ps.executeUpdate();
				if(n>=1)
					flag=true;	
			}
			else if(ch==3)
			{
				Connection con=DBConnection.createConnection();
				String query="update student set city=? where rollno=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,update);
				ps.setInt(2, roll);
				int n=ps.executeUpdate();
				if(n>=1)
					flag=true;	
			}
			else
			{
				Connection con=DBConnection.createConnection();
				String query="update student set percentage=? where rollno=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,update);
				ps.setInt(2, roll);
				int n=ps.executeUpdate();
				if(n>=1)
					flag=true;	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}

	@Override
	public boolean showStudentById(int roll) {
		boolean flag=false;
		try
		{
			Connection con=DBConnection.createConnection();
			String query="select * from student where rollno="+roll;
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery(query);
			while(r.next())
			{
				flag=true;
				System.out.println("Roll Number:"+r.getInt(1)+
						          "\nName:"+r.getString(2)+
						           "\nClg Name:"+r.getString(3)+
						           "\nCity:"+r.getString(4)+
						           "\nPercentage:"+r.getDouble(5));
				System.out.println("----------------\n");
			}
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}

}
