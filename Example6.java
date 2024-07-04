package com.assignment;
/*
 * Java Program to replace the spaces of a string with a specific character
 */
public class Example6 {

	public static void main(String[] args) {
		  String input = "Welcome to Java Programming";
	        char replacementChar = '-';
	        
	        String result = input.replace(' ', replacementChar);
	        
	        System.out.println("String with spaces replaced:");
	        System.out.println(result);
	    }

	}


