package com.core;

class Vehicle
{
	void setMaxSpeed(int speed)
	{
		System.out.println("My Speed Is "+speed);
	}
}
class Activa extends Vehicle
{
	void NoOfTyre(int tyre)
	{
		System.out.println("I Have "+tyre);
	}
}
class Car extends Vehicle
{
	void NoOfTyre(int tyre)
	{
		System.out.println("I Have "+tyre);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		Activa a=new Activa();
		a.setMaxSpeed(100);
		a.NoOfTyre(2);
		
		Car c=new Car();
		c.setMaxSpeed(180);
		c.NoOfTyre(4);
	}
}
