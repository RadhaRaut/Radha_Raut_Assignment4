package com.assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*
 * Write Java program to print all unique words present in the string.
   Write a Java program to reverse a string
 */
public class Example1 {

	public static void main(String[] args) {
		
		String str = "Welcome to java programming";
		
		Set <String>uniqueKeyword= new HashSet<>();
		StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
        	uniqueKeyword.add(st.nextToken());
        }
        
        System.out.println("Unique words in the string:");
        for (String word : uniqueKeyword) {
            System.out.println(word);
        }

	}

}
