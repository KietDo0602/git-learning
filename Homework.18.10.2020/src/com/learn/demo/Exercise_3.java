package com.learn.demo;

import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.nextLine().trim();
		System.out.println("Enter a index number between 0 and " + (str.length()-1));
		int index_1 = in.nextInt() -1;
		System.out.println("Enter another index number between 0 and " + (str.length()-1));
		int index_2 = in.nextInt() -1;
		int char_code_1 = str.codePointAt(index_1);
		int char_code_2 = str.codePointAt(index_2);
		char char1 = str.charAt(index_1);
		char char2 = str.charAt(index_2);
		System.out.println("The unicode code point of character at position "+ index_1 + " is "+ char_code_1 + " character: " + char1 );
		System.out.println("The character at position "+ index_2 + " is "+ char_code_2);
	}
}
