
package com.array.practise;

public class Asendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,51,35,48,95};
		int swap;
		
		System.out.println("asending order");
		for(int i=0;i<a.length;i++)
		{
          for(int j=i+1; j<a.length;j++)
          {
        	   if(a[i]>a[j])
        	   {
        		   swap=a[i];
        		   a[i]=a[j];
        		   a[j]=swap;
        	   }
          }
        	System.out.println(a[i]);  
		}
		System.out.println("second higest number"+a[1]);

	}

}
