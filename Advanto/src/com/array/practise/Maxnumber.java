package com.array.practise;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {50,14,32,45,82};
		
		int max=a[0];
		{
			
			System.out.println("length ofgf arrayb:"+a.length);
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
		}
			System.out.println("maximum number of array:"+max);
		
	}

}
