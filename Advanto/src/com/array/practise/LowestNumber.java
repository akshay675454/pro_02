package com.array.practise;

public class LowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {10,52,5,45,85};
      int min=a[0];
      
      for(int i=1;i<a.length;i++)
      {
    	  if(min>a[i])
    	  {
    		min=a[i]; 
    	  }
      }
      System.out.println(min);
	}

}
