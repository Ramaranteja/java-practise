package com.java;

class Student1{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalize method called");
	}
	
}

public class GarbageCollector {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1);
		Student1 s2=new Student1();
		System.out.println(s2);
		Student1 s3=new Student1();
		System.out.println(s3);
		s1=s3;
		s1=null;
		System.gc();
		
		
	}

}
