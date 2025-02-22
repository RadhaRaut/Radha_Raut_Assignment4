package com.assignment;

import java.util.HashMap;
import java.util.Map;

/*
 * Java program to find the duplicate characters in a string
 */
public class Example8 {

	public static void main(String[] args) {
		String input = "programming";
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
	}


