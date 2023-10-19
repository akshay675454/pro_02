package Abstraction;

public class Demo1 extends Demo {
	
	void addition()
	{
		System.out.println(" this is addition");
	}
	
	void substraction()
	{
	 res =a-b;
	 System.out.println("substraction ="+res);
	 
	}
	
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.addition();
		obj.substraction();
	}

}
