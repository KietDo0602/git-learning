package com.learn.demo;

public class Exercise_11 {
	public static void main(String[] args) {
		char[] array = new char[] {'5','6','7','8', '9', '1'};
		String String_obj_array = String.copyValueOf(array, 1, 5);
		System.out.println("I am " + String_obj_array + " years old today.");
	}
}
