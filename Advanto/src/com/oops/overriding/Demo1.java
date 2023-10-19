package com.oops.overriding;

public class Demo1 extends Demo{
	
	void addition()
	{
		res =a+b;
		System.out.println("addition ="+res);
		System.out.println("this is demo1 method");
	}


      public static void main(String args[])
      {
    	     Demo1 obj = new Demo1();
    	     obj.addition();
      }
}

