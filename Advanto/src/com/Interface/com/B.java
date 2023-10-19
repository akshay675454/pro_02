package com.Interface.com;

public class B implements Demo1{
	
	
	public void Add() {
		
		System.out.println("addition");
	}
	public void A()
	{
		int res=a+b;
		System.out.println("two method="+ a);
		System.out.println(" first method");
	}
	
	public void B() {
		System.out.println("seconds method");
	}
	public void C()
	{
		System.out.println("third method");
	}
	
	public void D() {
	
		System.out.println("four method");
	}
	
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.A();
		obj.B();
		obj.C();
		obj.D();
		
		System.out.println(B.c);
		System.out.println(B.a);
		System.out.println(B.b);
		System.out.println(Demo.a);
		System.out.println(Demo.b);
		System.out.println(Demo1.c);
		

		
	
		
		
	}
	
	     

}
