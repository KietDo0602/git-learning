package com.learn.demo;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.nextLine().trim();
		System.out.println("Enter a index number between 0 and " + (str.length()-1));
		int index_1 = in.nextInt();
		System.out.println("Enter another index number between 0 and " + str.length());
		int index_2 = in.nextInt();
		char char1 = str.charAt(index_1);
		char char2 = str.charAt(index_2);
		System.out.println("The character at position "+ index_1 + " is "+ char1);
		System.out.println("The character at position "+ index_2 + " is "+ char2);
	}
}
