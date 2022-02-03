package com.assignments.string;
//swap two strings without using the third variable
public class MyStringSwap 
{
	public static void main(String args[])
	{
		String a="Peter";
		String b="Griffin";
		
		System.out.println("Before Swapping: "+a+" "+b);
		a=a+b;
		b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After Swapping: "+a+" "+b);
	}

}
