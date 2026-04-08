package com.java;

public class Bank1 {
	static int accountno=100;
	String name;
	double balance;
	{
		accountno++;
	}
	void display() {
		System.out.println("Account Number:"+accountno);
		System.out.println("Accountholder name:"+name);
		System.out.println("Account balance:"+balance);
		
	}

	public static void main(String[] args) {
		Bank1 b1=new Bank1();
	
		b1.name="ram";
		b1.balance=5789.4;
		b1.display();
		Bank1 b2=new Bank1();
		b2.name="charan";
		b2.balance=321465.7;
		b2.display();
		

	}

}
