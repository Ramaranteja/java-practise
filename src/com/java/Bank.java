package com.java;

public class Bank {
	int AccountNumber;
	 String AccountHoldername;
	double balance;
	static String Bankname;
	static String Branch;
	
	
public static void main(String[] args) {
	Bank bn=new Bank();
	bn.AccountHoldername="Rohit";
	bn.AccountNumber=2221111;
	bn.balance=45687;
	Bankname="SBI";
	Branch="Hyderbad";
	
	System.out.println("Person 1 Details");
	System.out.println("Name:"+bn.AccountHoldername);
	System.out.println("ACCNUmber:"+bn.AccountNumber);
	System.out.println("Balance:"+bn.balance);
	System.out.println("BankName:"+Bankname);
	System.out.println("Branch:"+Branch);
	Bank ram=new Bank();
	ram.AccountHoldername="Kohli";
	ram.AccountNumber=2221111;
	ram.balance=45687;
	Bankname="SBI";
	Branch="Hyderbad";
	System.out.println("Person 2 Details");
	System.out.println("Name:"+ram.AccountHoldername);
	System.out.println("ACCNUmber:"+ram.AccountNumber);
	System.out.println("Balance:"+ram.balance);
	System.out.println("BankName:"+Bankname);
	System.out.println("Branch:"+Branch);
	Bank cha=new Bank();
	cha.AccountHoldername="Bumarh";
	cha.AccountNumber=2221111;
	cha.balance=45687;
	Bankname="SBI";
	Branch="Hyderbad";
	System.out.println("Person 3 Details");
	System.out.println("Name:"+cha.AccountHoldername);
	System.out.println("ACCNUmber:"+cha.AccountNumber);
	System.out.println("Balance:"+cha.balance);
	System.out.println("BankName:"+Bankname);
	System.out.println("Branch:"+Branch);
	
	
}
}
