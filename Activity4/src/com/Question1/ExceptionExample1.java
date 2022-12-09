package com.Question1;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		
		//enter value for a and b
		System.out.println("Enter first number:");
		a=s.nextInt();
		
		System.out.println("Enter second number:");
		b=s.nextInt();
			try
			{
				//a is divided by b 
				c=a/b;
			    System.out.println("Division ="+c);
			}
			
			catch(ArithmeticException e)
			{
				//Arithmetic Exception is thrown when user try to divide by zero
				System.out.println(e);
			}
			try
			{
				if(a==0 && b==0)
				{
					System.out.println("number is not entered");
				}
			}
			catch(NullPointerException e)
			
			{
				//0 divided 0 then  null pointer exception occurs
				System.out.println(e);
			}
			
			
		}
	
		

	

}
