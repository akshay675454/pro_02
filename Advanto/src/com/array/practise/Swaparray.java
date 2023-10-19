package com.array.practise;

public class Swaparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,85,45,78};
		   int swap;
		   System.out.println("array is desending order ");
		   
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++) {
				   
				   if(a[i]<a[j]) {
					   swap=a[i];
					   a[i]=a[j];
					   a[j]=swap;
					   				 			   
				   }		 
		   }
			   System.out.println(a[i]);
			   
		   }
		   System.out.println("result=" +a[2]);
	
}}