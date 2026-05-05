package com.logicalstatements;

import java.util.Scanner;

public class Ifelsecalculator {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value= ");
		int a=sc.nextInt();
		System.out.println("enter b value= ");
		int b=sc.nextInt();
		System.out.println("Enter Mathematical operator + , _ , * , / , %");
		String operator=sc.next();
		if(operator.equals("+")) {
			int add=a+b;
			System.out.println("Additon of "+a+" and "+b+" = "+add);
		}
		else if(operator.equals("-")) {
			int sub=a-b;
			System.out.println("Subtraction of "+a+" and "+b+" = "+sub);
		}
		else if(operator.equals("*")) {
			int mul=a*b;
			System.out.println("Multiplication of "+a+" and "+b+" = "+mul);
		}
		else if(operator.equals("/")) {
			double div=a/b;
			System.out.println("Division of "+a+" and "+b+" = "+div);
		}
		else if(operator.equals("%")) {
			int mod=a%b;
			System.out.println("Modulus of "+a+" and "+b+" = "+mod);
		}
		else {
			System.out.println("invalid operator");
		}
	}

}
