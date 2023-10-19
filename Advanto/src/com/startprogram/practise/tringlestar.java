package com.startprogram.practise;

public class tringlestar {

	public void T()
	{
		for(int i=1;i<=4;i++)//rows
		{
			for(int j=1;j<=i;j++)//colums
			{
				System.out.print( " * ");
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tringlestar ta = new tringlestar();
		
		ta.T();
		
		

	}

}
