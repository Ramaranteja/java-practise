package com.logicalstatements;

import java.util.Scanner;

public class Ifelse1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	if(n%2==0) {
		System.out.println("number "+n+" is even");
	
	}
	else {
	
		System.out.println("number "+n+" is odd");
	
	}
	}

}
