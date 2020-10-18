package com.learn.demo;

import java.util.Scanner;

public class Exercise_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string : ");
		String str_1 = in.nextLine();
		System.out.println("Please enter another string : ");
		String str_2 = in.nextLine();
		String str_3 = str_1.concat(str_2);
		System.out.println("The new concatted string is : " + str_3);
	}
}
