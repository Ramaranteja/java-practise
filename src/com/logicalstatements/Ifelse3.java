package com.logicalstatements;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		String name="admin";
		String password="1234";
		 String uname=sc.next();
		 String upassword=sc.next();
		 if(name.equals(uname) && password.equals(upassword)) {
			 System.out.println("Login Sucessfull");
		 }
		 else {
			 System.out.println("Invalid details");
		 }
	}

}
