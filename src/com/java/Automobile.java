package com.java;
import java.util.Scanner;

public class Automobile {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int w=sc.nextInt();
		if( w%2 !=0 || w<2*v || w>4*v) {
			System.out.println("-1");

	}
		int FourWheels=((w-2*v)/2);
		int TwoWheels=v-FourWheels;
				System.out.println(FourWheels+"  "+TwoWheels);

}
}
