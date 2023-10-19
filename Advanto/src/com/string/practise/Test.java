package com.string.practise;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a= {'a','k','s','h','a','y'};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------------------------------------");
		
		String studentname ="akshay";
		System.out.println(studentname);
		
		System.out.println("-----------------------------------------------");
		
		String studentname1 = new String("akshay");
		   System.out.println(studentname1);
		   
		   
		   System.out.println("--------------------------");
		   
		   String city ="mumbai";
		   
		   System.out.println(city);
		   System.out.println("--------------------------------------");
		   
		   String  city1 = new String("pune");
		   
		   System.out.println(city1);
		   System.out.println("------------------------------------------");
		   
		   String s="sachin";
		   s.concat("tendulkar");
		   System.out.println(s);
		   
		   StringBuffer s1 = new StringBuffer("virat");
		   System.out.println(s1+" ");
		   
		   s1.append("kohali");
		   System.out.println(" "+s1);
		   
		   StringBuffer s2 = new StringBuffer("ram");
		   System.out.println(s2);
		   s2.append("laxman");
		   System.out.println(s2);
		   
		   StringBuilder s3= new StringBuilder("ms");
		   System.out.println(s3);
		   s3.append("dhoni");
		   System.out.println(" " + s3 +" ");
		   
		   String s4= new String("pune");
		   String  s5= new String("pune");
		   
		   //compare two string same or not usingg double equal operator
		   System.out.println(s4==s5);
		   System.out.println(s4.equals(s5));
		   
		   String s6 = "mumbai";
		   String s7 ="mumbai";
		   System.out.println(s6.equals(s7));
		   System.out.println(s6==s7);
		   System.out.println("------------------------------");
		   
		   String f="mumbai";
		    char c=f.charAt(5);
		    System.out.println(c);
		    
		    System.out.println("-------------------------");
		    
		    String c1 = "akshay";
		    String c2 = "abhang";
		    System.out.println(c1.concat(c2));
		    System.out.println("-----------------------------");
		    
		    String m = new String("mumbai");
		    
		    String ci= new String("city");
		    
		    System.out.println(m.concat(ci));
		    
		    
		    String a1="mumbai";
		    
		    boolean reqres = a1.equals("Mumbai");
		    System.out.println(reqres);
		    
		   System.out.println(a1.contains("i"));
		   
		   System.out.println(a1.startsWith("Mum"));
		   
		    Boolean restartwith=a1.startsWith("Mum");
		    System.out.println("starts with="+restartwith);
		    
		    boolean endswith =a1.endsWith("i");
		    System.out.println("ends with="+ endswith);
		    
		    boolean  d1= a1.equalsIgnoreCase("mumbai");
		    System.out.println(d1);
		    int d2=a1.indexOf("u");
		    System.out.println(d2);
		    
		    int d3=a1.lastIndexOf("m");
		    System.out.println(d3);
		    
		   int d4= a1.length();
		   System.out.println(d4);
		   
		   String d5=a1.replaceFirst("m","a");
		   System.out.println(d5);
		   
		   String d6 = a1.replace("u", "c");
		   System.out.println(d6);
		   
		   String d7=a1.replace("i", "m");
		  System.out.println(d7);
		  
		  String d8 =a1.replace("mumbai", "pune");
		  System.out.println(d8);
		  
		  System.out.println("----------------------");
		  
		  
		  String a2 ="mumbai -city";
		   String[] d9=a2.split("-city");
		   for(int i=0;i<d9.length;i++)
		   {
			   System.out.print(d9[i]);
		   }
		   
		   System.out.println();
		   
		   String k1=a2.substring(5);
		   System.out.println(k1);
		    
		   String k2=a2.substring(3, 9);
		   System.out.println(k2);
		   
		   String a3 = "mumbai";
		   
		  char[] k3= a3.toCharArray();
		  
		  for(char data:k3)
		  {
			 
			System.out.println(data);
		  }
		  
		  System.out.println("-------------------------");
		  String a4 = "pune ";
		  
		   char[] k4=a4.toCharArray();
		  for(char data:k4) {
			  System.out.println(data);
		  }
		  
		  System.out.println(a4.toLowerCase());
		  
		  System.out.println(a3.toUpperCase());
		  
		   String  j1=a4.trim();
		   System.out.println(j1);
		   
		   
		   System.out.println(a4.isEmpty());
		  
		  StringBuffer sbb = new StringBuffer("akshay");
		      System.out.println(sbb.reverse());
		      
		      System.out.println(sbb.append(a));
		  
		 
		  
				   
	}
	

}
