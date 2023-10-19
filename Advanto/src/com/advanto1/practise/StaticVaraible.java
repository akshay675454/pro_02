package com.advanto1.practise;

public class StaticVaraible {

	static {
		System.out.println("this is staic block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        StaticVaraible db= new StaticVaraible();
		
		System.out.println("this is main method");
	}
	
	StaticVaraible()
	{
		
		System.out.println("this is constructor");
	}
	{
		System.out.println("this is non  staticblock");
	}
	
	

}
