package com.core;

import java.util.Scanner;

class Circle
{
	double pi=3.14;
	double radius;
	Circle()
	{
		System.out.println("Default Constructor Of Circle Called");
		radius=5.5;
	}
	Circle(double r)
	{
		System.out.println("Parameterized Constructor Of Circle Called");
		radius=r;
	}
	Circle(Circle c)
	{
		System.out.println("Copy Constructor Of Circle Called");
		radius=c.radius;
	}
	void volume()
	{
		System.out.println("Area Of Circle Is : "+pi*radius*radius);
	}
}

class Box
{
	double width,height,depth;
	
	// Default Constructor
	Box()
	{
		System.out.println("Default Constructor Called");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Width : ");
		width=sc.nextDouble();
		System.out.print("Enter Height : ");
		height=sc.nextDouble();
		System.out.print("Enter Depth : ");
		depth=sc.nextDouble();
	}
	
	// Parameterized Constructor
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)
	{
		System.out.println("Copy Constructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	// User defined Function
	void volume()
	{
		System.out.println("Volume Of Box : "+(width*height*depth));
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		Box b1=new Box(); 	// Create an object of Default Constructor
		b1.volume();		// Call an object of Default Constructor
		Box b2=new Box(4,5,6);	// Create an object of Parameterized Constructor
		b2.volume();			// Call an object of Parameterized Constructor
		Box b3=new Box(b2);
		b3.volume();
		
		Circle c1=new Circle();
		c1.volume();
		Circle c2=new Circle(6.6);
		c2.volume();
		Circle c3=new Circle(c2);
		c3.volume();
		
		System.out.println("End Of Main Method");
	}
}
