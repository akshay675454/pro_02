package com.Static.practise;

public class Demo {
	
	static void addition()
	{
		int a =10;
		int b=20;
		int res = a+b;
		
		System.out.println("addition"+" "+res);
	}

	void substraction()
	{
		int a=10;
		int b=20;
		int res = a-b;
		System.out.println("substraction"+" "+res);
		
	}
	public static void main(String[] args) {
		Demo.addition();
		
		Demo obj = new Demo();
		obj.substraction();
		
	}
}
