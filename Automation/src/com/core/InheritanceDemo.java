package com.core;

import java.util.Scanner;

class A
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
class B extends A
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
public class InheritanceDemo {

	public static void main(String[] args) {
		B b1=new B();
		b1.setA();
		b1.setB();
		b1.putA();
		b1.putB();
	}
}
