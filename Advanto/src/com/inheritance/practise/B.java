package com.inheritance.practise;

public class B extends A {
	int a =30;
    int b=50;
    int res;
    
    void substraction() {
      res=a-b;
      System.out.println("substraction ="+res);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.addition();
		B obj1 = new B();
		obj1.substraction();
		
		
		
		

	}

}
