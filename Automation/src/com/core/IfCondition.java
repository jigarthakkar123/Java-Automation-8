package com.core;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.print("Enter C : ");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A Is Max Number");
			}
			else
			{
				System.out.println("C Is Max Number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B Is Max Number");
			}
			else
			{
				System.out.println("C Is Max Number");
			}
		}
	}
}
