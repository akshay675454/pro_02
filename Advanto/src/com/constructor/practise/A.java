package com.constructor.practise;

public class A {
	
	 int a =25;
	 int b=10;
	 int res;

	A(){
		res = a+b;
		System.out.println("addition ="+ ' ' +res);
		
	}
	public static void main(String[] args) {
		A obj = new A();
	}
}
