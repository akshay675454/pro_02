package com.array.practise;

public class LargestNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {20,45,25,78,68,95};
		int max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximun of two number"+ " "+max);

	}

}
