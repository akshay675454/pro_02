package com.Static.practise;

import com.oops.overriding.Main;

public class ParamteriseMethod {
	
	void add()
	{
		int a =20;
		int b=10;
		int res =a+b;
		System.out.println("addition of two number =" +res);
	}
		
	static void substraction()
	{
		
		int a=20;
		int b=10;
		int res = a-b;
		System.out.println("substraction of two number =" +res);
	}
	
	  void mul() {
		  int a=5;
		  int b=8;
		  int res = a*b;
		  System.out.println("multiplication of two number ="+res);
	}
	  int addi()
	  {
		int a =10;
		int b=30;
		int res = a+b;
		return res;
		
	  }
	  
	  	 int subs()
	  	{
	  		int a =10;
	  		int b=45;
	  		int res = a-b;
	  		return res;
	  	}
	  	 
	  	 int multi()
	  	 {
	  		 int a = 8;
	  		 int b=4;
	  		 int res = a+b;
	  		 return res;
	  	 }
	  	      int divi(){
	  		   
	  		   int a =10;
	  		   int b =8;
	  		   int res = a/b;
	  		   return res;
	  	   }
	  	 
		public static void main(String[] args) {
			
			ParamteriseMethod obj = new ParamteriseMethod();
			obj.add();
			obj.mul();
			ParamteriseMethod.substraction();
			
			int addition = obj.addi();
			System.out.println("addition of retrun ="+ addition);
			
			int substract = obj.subs();
			System.out.println("substraction of retrun =" + substract);
			
			
		      int multiplication =obj.multi();
		      
		      System.out.println("multiplcation of retrun ="+ multiplication);
		      
		      int division = obj.divi();
		      System.out.println("division of retrun ="+division);
		}
				
		
	}


