package com.java;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		int[] arr= {10,12,5,40,30,7,5,9,10};
		List<Integer> multiples=new java.util.ArrayList<>();
		List<Integer> nonmultiples=new java.util.ArrayList<>();
		for(int num:arr) {
			if(num%10 ==0) {
				multiples.add(num);
				
			}
			else {
				nonmultiples.add(num);
			}
		}
		int index=0;
		for(int num : nonmultiples) {
			arr[index++]=num;
		}
		for(int num : multiples) {
			arr[index++]=num;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
