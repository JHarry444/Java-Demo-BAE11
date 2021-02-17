package com.qa.mypackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7; // CODE STARTS HERE
		Integer integer = 7;
		i = 8;
		System.out.println(i);
		String s = "fvnvfdjvdfjbdf";
		System.out.println("Len: " + s.length());
		int numberOfCats = 1;
		
		int a = 1;
		
		System.out.println(a);
		
		a++; //1 + 1 = 2
		
		System.out.println(a);
		
		a--; // 2 - 1 = 1
		
		System.out.println(a);
		
		int b = 1;
		
		System.out.println(--b); // b = 0, 0 printed
		System.out.println(b); // b = 0, 0 printed
		System.out.println(b++); // b = 1, 0 printed
		System.out.println(b);// b = 1, 1 printed
	
		b = b + 1; // b++
		b += 1; // b = b + 1
		
		System.out.println(!true == false);
		
		int i2 = 22;
		long l = 22;
		
		System.out.println(i2 == l);
		
		
		char c = 'h';
		System.out.println(0 + c);
		System.out.println(104 == c);
		method1();
		System.out.println("j" + "j"+ "h");
		System.out.println('j' + 'j' + 'h');
		// CODE ENDS HERE
	}
	
	public static void method1() {
		System.out.println("I'M A METHOD");
	}

}
