package com.core;

class P1
{
	P1()
	{
		System.out.println("P1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From P1");
	}
}
class P2 extends P1
{
	P2()
	{
		System.out.println("P2's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From P2");
	}
}
class P3 extends P2
{
	P3()
	{
		System.out.println("P3's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From P3");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		P3 p=new P3();
		p.show();
	}
}
