package com.assignments.string;
//Reverse a string in Java without using the reverse method

import java.util.*;
public class MyReverse 
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the string: ");	
	  String str = s.next();
	  String revString = "";

	  for (int i = str.length() - 1; i >= 0; i--) 
	  {
		  revString += str.charAt(i);
	  }

	  System.out.println(revString);
	 }

}
