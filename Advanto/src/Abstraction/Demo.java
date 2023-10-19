package Abstraction;

public abstract class Demo {
	
	int a =10;
	int b=20;
	int res;
	
	void addition()
	{
		res = a+b;
		System.out.println("addition ="+res);
	}
        abstract void substraction();


}
