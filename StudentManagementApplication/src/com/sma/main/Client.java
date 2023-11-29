package com.sma.main;

import java.util.Scanner;
import com.sma.model.Student;
import com.sma.dao.StudentDao;
import com.sma.dao.StudentDaoInterface;

public class Client {

	public static void main(String[] args) {
		
		StudentDaoInterface dao=new StudentDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Student Management Application\n");
		while(true)
		{
			System.out.println("1.Add Student\n"
					+ "2.Show all Students\n"
					+ "3.Get Student based on Roll Number\n"
					+ "4.Delete Student\n"
					+ "5.Update Student\n"
					+"6.exit\n");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case(1):
					System.out.println("Add student\n");
					System.out.println("enter Student name");
					String name=sc.nextLine();
					System.out.println("enter Student college name");
					String clgName=sc.nextLine();
					System.out.println("enter city");
					String city=sc.nextLine();
					System.out.println("enter percentage");
					double percentage=sc.nextDouble();
					Student s=new Student(name,clgName,city,percentage);
					boolean ans=dao.insert(s);
					if(ans)
						System.out.println("Record inserted Successfully\n");
					else
						System.out.println("Something went wrong,Please try again\n");
						
				 	break;
				case(2):
					System.out.println("Show all students\n");
					dao.showAllStudent();
					break;
				case(3):
					System.out.println("Get Student based on Roll Number\n");
					System.out.println("enter Roll Number");
					int rollNo=sc.nextInt();
					boolean f=dao.showStudentById(rollNo);
					if(!f)
						System.out.println("Student with this id is not available\n");
					break;
				case(4):
					System.out.println("Delete Student by Roll Number\n");
					System.out.println("enter Roll Number");
					int roll=sc.nextInt();
					boolean ff=dao.delete(roll);
					if(ff)
						System.out.println("Record deleted successfully\n");
					else
						System.out.println("This Roll number is not available\n");
					
					break;
				case(5):				
					System.out.println("update student\n");
					System.out.println("1.Update name\n2.Update clgName\n3.update city\n4.update percentage\n" );
					System.out.println("enter your choice");
					int ch=sc.nextInt();
					if(ch==1)
					{
						System.out.println("enter roll no");
						int r1=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter New Name");
						String newName=sc.nextLine();
						Student std=new Student();
						std.setName(newName);
						boolean flag=dao.update(r1,newName, ch, std);
						if(flag)
							System.out.println("Name updated successfully\n");
						else
							System.out.println("This Roll number is not available\n");
					}
					else if(ch==2)
					{
						System.out.println("enter roll no");
						int r1=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter updated clgName ");
						String newClgName=sc.nextLine();
						Student std=new Student();
						std.setName(newClgName);
						boolean flag=dao.update(r1,newClgName, ch, std);
						if(flag)
							System.out.println("clgName updated successfully\n");
						else
							System.out.println("This Roll number is not available\n");
					}
					else if(ch==3)
					{
						System.out.println("enter roll no");
						int r1=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter city Name correctly");
						String newCity=sc.nextLine();
						Student std=new Student();
						std.setName(newCity);
						boolean flag=dao.update(r1,newCity, ch, std);
						if(flag)
							System.out.println("cityName updated successfully\n");
						else
							System.out.println("This Roll number is not available\n");
					}
					else if(ch==4)
					{
						System.out.println("enter roll no");
						int r1=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter percentage correctly");
						String newPercentage=sc.nextLine();
						Student std=new Student();
						std.setName(newPercentage);
						boolean flag=dao.update(r1,newPercentage, ch, std);
						if(flag)
							System.out.println("Percentage updated successfully\n");
						else
							System.out.println("This Roll number is not available\n");
					}
					else
					{
						System.out.println("The number is not valid\n");
					}
					
					break;
				case(6):
					System.out.println("Thank you for using Student Management Application");
					System.exit(0);
				default:
					System.out.println("Please enter valid number\n");
			}
		}

	}

}
