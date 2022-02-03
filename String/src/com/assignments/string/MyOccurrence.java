package com.assignments.string;
//count the occurrence of the given character in a string
import java.util.Scanner;

public class MyOccurrence 
{
	public static void main(String args[]) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("String: ");
	  String input = s.next();                	  
	  int count=0;
	  System.out.println("enter a character");
	  char ch = s.next().charAt(0);
	  char search = ch;
	  
	  for(int i=0; i<input.length(); i++)
	  {
	      if(input.charAt(i) == search)
	      {
	    	  count++;
	      }
	  }
	  
	  System.out.println("The Character '"+search+"' appears "+count+" times.");
	}
}