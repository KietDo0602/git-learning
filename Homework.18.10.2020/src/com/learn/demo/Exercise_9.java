package com.learn.demo;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string : ");
		String str_1 = in.nextLine();
		System.out.println("Please enter another string for comparison purposes : ");
		String str_2 = in.nextLine();
		System.out.println("Is the the second string similar to the first string? ");
		System.out.println("Answer: " + str_1.contentEquals(str_2));
	}
}
