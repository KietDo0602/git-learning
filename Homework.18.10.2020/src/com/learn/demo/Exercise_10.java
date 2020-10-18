package com.learn.demo;

import java.util.Scanner;

public class Exercise_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string : ");
		String str_1 = in.nextLine();
		StringBuffer str_buf_1 = new StringBuffer(str_1);
		System.out.println("Please enter another string for comparison purposes : ");
		String str_2 = in.nextLine();
		System.out.println("Is the the first string and the second string similar to the string buffer? ");
		System.out.println("Answer: " + str_1.contentEquals(str_buf_1));
		System.out.println("Answer: " + str_2.contentEquals(str_buf_1));
		System.out.println(str_1 + str_buf_1);
	}
}
