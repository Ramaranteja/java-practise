package com.java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Objectdatatypes {

	public static void main(String[] args) {
		BigInteger bi1=new BigInteger("75379520158756532");
		BigInteger bi2=new BigInteger("15998752425245");
		BigDecimal bd1=new BigDecimal("6478521456963333.456098732");
		BigDecimal bd2=new BigDecimal("35789654563214.587469621233");
		
		System.out.println("Mathematical operations of Big integer:");
		System.out.println("Addition="+ bi1.add(bi2));
		System.out.println("Multiplication="+bi1.multiply(bi2));
		System.out.println("Substraction="+bi1.subtract(bi2));
		System.out.println("Division="+bi1.divide(bi2));
		
		System.out.println("********************************");
		System.out.println("Mathematical operations of Big Decimal :");
		
		System.out.println("Addition="+bd1.add(bd2));
		System.out.println("Multiplication="+bd1.multiply(bd2));
		System.out.println("Substraction="+bd1.subtract(bd2));
		System.out.println("Division="+bd1.divide(bd2,5,RoundingMode.HALF_UP));
		
		
	}

}
