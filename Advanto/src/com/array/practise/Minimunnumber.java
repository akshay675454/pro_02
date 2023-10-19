package com.array.practise;

public class Minimunnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {10,20,35,45,25};
		int min=a[0];
		{
			for(int i=1;i<a.length;i++)
			{
				
				if(min >a[i])
				{
					min=a[i];
				}
			}
			System.out.println("minimun of number"+min);
		}
 
	}

}
