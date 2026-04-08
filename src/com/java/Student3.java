package com.java;

public class Student3 {
	int id;
	String Name;
	int marks;
	void details() {
		id=111;
		Name="ram";
		marks=955;
	}
	void display() {
		details();
		System.out.println("Student Id:"+id);
		System.out.println("Student name:"+Name);
		System.out.println("Student Marks:"+marks);
		
	}
	public static void main(String[] args) {
		Student3 std=new Student3();
		std.display();
		
	}

}
