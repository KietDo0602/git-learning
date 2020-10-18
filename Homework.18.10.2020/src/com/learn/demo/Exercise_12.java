package com.learn.demo;

import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string : ");
		String str_1 = in.nextLine();
		System.out.println("Please enter another string at the end of the first string : ");
		String str_2 = in.nextLine();
		System.out.println("Does the first string end with the second string?");
		boolean answer = str_1.endsWith(str_2);
		System.out.println("Answer: " + answer);
	}
}
