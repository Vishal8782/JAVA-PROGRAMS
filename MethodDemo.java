public class MethodDemo {
	package com.prowings.method;

public class ReturnTypeMethod2 {
	
	
	public int addition(int a, int b)
	{
		System.out.println("addition method started!!!");
		int res = a + b;
		
		System.out.println("addition method ended!!!");
		
		return res;
	}
	public int square(int a)
	{
		System.out.println("square method started!!!");
		int res = a * a;
		System.out.println("square method ended!!!");
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		
		int adition_result = obj.addition(10, 30);
		
		System.out.println(">>> Addition is : "+adition_result);
		
		int squareRes = obj.square(adition_result);
		
		System.out.println(">>> Square is : "+squareRes);
		
		System.out.println("main method ended!!!");
	}
	
}