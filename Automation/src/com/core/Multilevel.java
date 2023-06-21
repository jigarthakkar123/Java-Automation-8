package com.core;

import java.util.Scanner;

class A1
{
	int a;
	void setA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of A  :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B1 extends A1
{
	int b;
	void setB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of B  :");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C1 extends B1
{
	int c;
	void setC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of C  :");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		C1 c=new C1();
		c.setA();
		c.setB();
		c.setC();
		
		c.putA();
		c.putB();
		c.putC();
	}
}
