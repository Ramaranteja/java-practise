package com.logicalstatements;

import java.util.Scanner;

public class Ifelse4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char value");
		char c=sc.next().charAt(0);
		if((c>='A' && c<='Z') || (c>='a' && c<='z') ) {
			System.out.println("It is a Alphabet");
			
		}
		else if(c>='0' && c<='9') {
			System.out.println("it is digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
