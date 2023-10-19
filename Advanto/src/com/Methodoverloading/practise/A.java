package com.Methodoverloading.practise;

public class A {
	
	int a =20;
	int b =10;
	int res;
	
	void addition() {
		
		res = a+b;
		System.out.println(" addition "+res);
	}
	
	void addition(double a ,double b)
	{
		double res = a+b;
		System.out.println("addition ="+res);
		}
	
	void addition(long a ,long b) {
		long res = a+b;
		System.out.println("addition ="+res);
	}
	 public static void main(String[] args) {
		A obj = new A();
		obj.addition();
		obj.addition(25, 20);
		obj.addition(25, 40);
	}

}
