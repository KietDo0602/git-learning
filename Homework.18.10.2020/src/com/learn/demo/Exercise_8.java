package com.learn.demo;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string : ");
		String str_1 = in.nextLine().replaceAll("\\s+", " ");
		System.out.println("Please enter another string inside the first string : ");
		String str_2 = in.nextLine();
		System.out.println("Does the first string contains the second string? ");
		System.out.println(str_1);
		System.out.println(str_1.contains(str_2));
	}
}
