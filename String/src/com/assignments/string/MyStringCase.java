package com.assignments.string;
//Check if two strings are the same ignoring their cases

import java.util.*;
public class MyStringCase 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1=s.next();
		System.out.println("Enter string 2: ");
		String str2=s.next();
		
		String a=str1.toLowerCase();
		String b=str2.toLowerCase();
		
		if (a.equals(b)==true)
		{
			System.out.println("Yes, they are same");
		}
		else
		{
			System.out.println("No, they are not");
		}
	}

}
