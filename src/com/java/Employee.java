package com.java;
import java.util.Scanner;

public class Employee {
	
	
	public static void main(String[ ] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary=");
		int salary=sc.nextInt();
		String name="ram";
		int PF=(salary*12)/100;
		int allowance=100*30;
		int netsalary=((salary+allowance)-PF);
		
		
		System.out.println("Employee Details");
		System.out.println("Name:"+name);
		System.out.println("Basic Salary:"+salary);
		System.out.println("PF(12%):"+PF);
		
		System.out.println("Allowances:"+allowance);
		System.out.println("Net Salary:"+netsalary);
		
		
		
		
		
	}

}
