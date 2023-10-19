package OPPS;

public class Constructor {
	
	Constructor()
	{
		System.out.println("constructor no 1");
		int a=10;
		int b=20;
		int res = a+b;
		System.out.println("addition of two no ="+res);
		System.out.println("-----------------------------------------");
		
	}
	Constructor(int a){
		
		System.out.println("constructor no 2");
		
		System.out.println(+a);
	}
	
	Constructor(int c, int b){
		 System.out.println("constructor no 3");
		 int res = c-b;
		 
		 System.out.println("sub =" +res);
	}
	 public static void main(String[] args) {
		
		 Constructor obj1 = new Constructor();
		 Constructor obj2 = new Constructor(10);
		 Constructor obj3 = new Constructor(10,20);
		 
	}

}
