package com.learn.demo;

import java.util.Scanner;

public class Exercise_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str_1 = in.nextLine();
		System.out.println("Please enter another string: ");
		String str_2 = in.nextLine();
		int result = str_1.compareToIgnoreCase(str_2);
		if(result < 0) {
			System.out.println("The first string " + str_1 + " is lexicographically less than the second string" + str_2);
		}
		else if (result > 0) {
			System.out.println("The first string " + str_1 + " is lexicographically more than the second string " + str_2);
		}
		else {
			System.out.println("Both strings are lexicographically similar if factor out case differences");
		}
	}
}
