package com.sma.model;

public class Student {
	
	private int rollNo;
	private String name;
	private String clgName;
	private String city;
	private double percentage;
	
	public Student()
	{
		
	}
	public Student(String name, String clgName, String city, double percentage) {
		this.name = name;
		this.clgName = clgName;
		this.city = city;
		this.percentage = percentage;
	}

	public Student(int rollNo, String name, String clgName, String city, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.clgName = clgName;
		this.city = city;
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", clgName=" + clgName + ", city=" + city
				+ ", percentage=" + percentage + "]";
	}

	
}
