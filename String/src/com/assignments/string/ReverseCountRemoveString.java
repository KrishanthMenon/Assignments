package com.assignments.string;

public class ReverseCountRemoveString 
{
	public static void main(String args[])
	{
		//reverse the words from the given string sentence
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Megatron");
		System.out.println(sb.reverse());
		
		//Count the number of words in a given string sentence
		System.out.println(sb.length());
		
		//Write a program to remove given characters from the string
		System.out.println(sb2.delete(2,4));
		
	}

}
