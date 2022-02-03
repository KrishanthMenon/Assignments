package com.assignments.string;
//swap two strings without using the third variable
import java.util.*;
public class MyStringSwap 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("String 1: ");
		String a=s.next();
		System.out.println("String 2: ");
		String b=s.next();
		
		System.out.println("Before Swapping: "+a+" "+b);
		a=a+b;
		b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After Swapping: "+a+" "+b);
	}

}
