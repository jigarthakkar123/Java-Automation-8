package com.core;

interface ifs1
{
	static void meth1()
	{
		System.out.println("meth1 defined in an interface ifs1");
	}
}
interface ifs2 extends ifs1
{
	void meth2();
}
class IfsDemo1 implements ifs1,ifs2//Implements More Than One Interface
{
	public void meth2() {
		ifs1.meth1();
		System.out.println("Meth2");
	}
}
class IfsDemo2 implements ifs2//ifs2 already extends ifs1
{

	public void meth2() {
		ifs1.meth1();
		System.out.println("Meth2 In Ifs2");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		IfsDemo1 i1=new IfsDemo1();
		
		i1.meth2();
		
		IfsDemo2 i2=new IfsDemo2();
		
		i2.meth2();
		
		ifs1.meth1();
	}
}
