package com.java;

public class Methods {
	
	static {
		Methods obj=new Methods();
		obj.method2();
	}
	static void method1() {
		System.out.println("Method1 Printed");
		method3();
		
		
	}
	void method2() {
		System.out.println("Method2 printed");
	   method4();
		
	}
	static void method3() {
		System.out.println("Method3 printed");
	}
	void method4() {
		System.out.println("Method4 printed");
		method1();

	}

	public static void main(String[] args) {
		

	}

}
