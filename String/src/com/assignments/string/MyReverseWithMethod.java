package com.assignments.string;
//reverse the words from the given string sentence
import java.util.Scanner;
public class MyReverseWithMethod 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("String: ");
		StringBuilder sb=new StringBuilder(s.next());
	
		System.out.println(sb.reverse());
	}

}
