package com.assignments.string;

public class CountRemoveString 
{
	public static void main(String args[])
	{
		
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Megatron");	
		
		//Count the number of words in a given string sentence
		System.out.println(sb.length());
		
		//Write a program to remove given characters from the string
		System.out.println(sb2.delete(2,4));
		
	}

}
