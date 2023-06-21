package com.core;

class Student
{
	int rno;
	String sname;
	void setValue(int r,String s)
	{
		this.rno=r;
		this.sname=s;
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setValue(1, "Jigar");
		
	}
}
