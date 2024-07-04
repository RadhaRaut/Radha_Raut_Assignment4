package com.assignment;
/*
 * Java Program to determine whether a given string is palindrome
 */
public class Example7 {

	public static void main(String[] args) {
		String input = "madam";
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
	}


