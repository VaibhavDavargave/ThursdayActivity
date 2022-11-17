package com.question1;

import java.util.Scanner;

public class Placements {

	public static void main(String[] args) {
		
		//taking input for placed student
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		int CSE=s.nextInt();
		System.out.println("Enter the no of student placed in IT:");
		int IT=s.nextInt();
		System.out.println("Enter the no of student placed in MECH:");
		int MECH=s.nextInt();
		
		if(CSE==IT && IT==MECH && CSE==MECH)
		{
			System.out.println("None of the department has got the highest placement");
		}
		else if(CSE>=0 && IT>=0 && MECH>=0)
		{
			if(MECH>IT && MECH>IT)
			{
				System.out.println("Highest placement MECH");
			}
			else if(CSE>MECH && CSE>IT)
			{
				System.out.println("Highest placement CSE");
			}
			else if(IT>MECH && IT>CSE)
			{
				System.out.println("Highest placement IT");
			}
			else if(IT==MECH)
			{
				System.out.println("Highest placement \nIT \nMECH");
			}
			else if(CSE==IT)
			{
				System.out.println("Highest placement \nCSE \nIT");
			}
			else if(CSE==MECH)
			{
				System.out.println("Highest placement \nCSE \nMECH");
			}
			else
			{
				System.out.println("Invalid input");
			}
		}

	}

}
