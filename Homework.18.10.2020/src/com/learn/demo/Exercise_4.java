package com.learn.demo;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.nextLine();
		int count = str.codePointCount(0, str.length());
		System.out.println("The codepoint count of the string " + str + " is " + count);
	}
}
