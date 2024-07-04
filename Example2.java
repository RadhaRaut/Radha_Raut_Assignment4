package com.assignment;
/*
 *  Write a Java program to reverse a string
 */
public class Example2 {

	public static void main(String[] args) {
		
		String str = "Welcome to java programming";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println("reverse a string:");
		System.out.println(reverse);

	}

}
