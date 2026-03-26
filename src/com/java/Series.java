package com.java;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value=");
		int result;
		
		int n=sc.nextInt();
		if(n%2 !=0) {
			int power=(n-1)/2;
			 result=(int)Math.pow(2, power);
			
		}
		else {
			int power=(n-2)/2;
			 result=(int)Math.pow(3, power);
		}
		System.out.println("Nth value:"+result);
	

	}

}
