package com.constructor.practise;

public class B {
	
	//B(int a , int b)
	//{
		
	//int res = a+b;
	//System.out.println("addition ="+ res);
	//}
	
	B(double c, double b)
	{
		double res = c-b;
		System.out.println("substr ="+res);
	}
	
	
		
	B(long c , long b){
		long res = c * b;
		System.out.println(" multiplication = "+res);
	}
	     
	public static void main(String[] args) {
		
		B obj = new B(10,20);
		B obj1 = new B(30,20);
		B obj2 = new B(40,25);
	}
	

	}


