package OPPS;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set  a = new HashSet();
		
		a.add("akshay");
		
		a.add(78);
		a.add(75.45);
		a.add("akshay");
		a.add("abc");
		a.add(78);
		a.add(true);
		a.add("akk");
		
		System.out.println(a);
	  // a.remove(89);
	     System.out.println(a.isEmpty());
	   //System.out.println(a.remove(a));
	    a.clear();
	     System.out.println(a);
	
	}

}
