package com.java;

public class CountObjects {
	static int count=0;
//	CountObjects (){
//		count ++;
//	}
	{
		count++;
	}

	public static void main(String[] args) {
		CountObjects obj1=new CountObjects();
		CountObjects obj2=new CountObjects();
		CountObjects obj3=new CountObjects();
		CountObjects obj4=new CountObjects();
		System.out.println("Number of objects="+count);

	}

}
