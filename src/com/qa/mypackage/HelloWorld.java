package com.qa.mypackage;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		message();
		System.out.println(getMessage());
		printMessage("Hello, World!");
	}
	
	public static void message() {
		System.out.println("Hello, World!");
	}
	
	public static String getMessage() {
		return "Hello, World!";
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
