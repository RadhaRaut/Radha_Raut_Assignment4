package com.assignment;
/*
 * Java Program to replace lower-case characters with upper-case and vice-versa

 */
public class Example5 {

	public static void main(String[] args) {
		
		String str = "Welcom To Java Programming";
		
		StringBuilder result = new StringBuilder();
		
		for(char c: str.toCharArray()) {
			if(Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			}
			else {
				result.append(c);
			}
		}
		System.out.println("Swapped case string:");
        System.out.println(result.toString());
	}

}
