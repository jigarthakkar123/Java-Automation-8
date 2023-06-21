package com.core;

abstract class RBI
{
	abstract void roi(double r);
}
class SBI extends RBI
{
	void roi(double r) {
		System.out.println("Rate Of Interest By SBI Is "+r);
	}
	
}
class ICICI extends RBI
{
	void roi(double r) {
		System.out.println("Rate Of Interest By ICICI Is "+r);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.roi(6.5);
		
		ICICI i=new ICICI();
		i.roi(7.5);
	}
}
