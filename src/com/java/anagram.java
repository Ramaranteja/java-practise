package com.java;
import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";

        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert to character array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

	}

}
