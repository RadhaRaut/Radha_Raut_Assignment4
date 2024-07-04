package com.assignment;
/*
 * Write a java program to print special characters from a given string, the string is "ajayk_kumar@gmail.com".
 */
public class Example4 {

	public static void main(String[] args) {
		
		String str= "ajayk_kumar@gmail.com";
		
		System.out.println("special character in the string is");
		
		for(char c : str.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) {
				System.out.println(c);
			}
		}

	}

}
