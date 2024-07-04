package com.assignment;

/*
 * Write a java program to get the vowels and consonants characters count from a given string,
 * the string is "Welcome to Java Programming".
 */
public class Example3 {

	public static void main(String[] args) {

		String str = "Welcome to Java Programming";

		int vowelsCount = 0;
		int consonantsCount = 0;

		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				if (isVowel(c)) {
					vowelsCount++;
				} else {
					consonantsCount++;
				}
			}
		}
		System.out.println("Number of vowels: " + vowelsCount);
		System.out.println("Number of consonants: " + consonantsCount);
	}

	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
