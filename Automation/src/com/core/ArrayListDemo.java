package com.core;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.10);
		list.add("tops");
		list.add('t');
		list.add(null);
		list.add(true);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(3));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ArrayList Element : ");
		int a=sc.nextInt();
		list.add(a);
		System.out.println(list);
		System.out.print("Enter Index Number To Remove Element : ");
		int index=sc.nextInt();
		list.remove(index);
		System.out.println(list);
		System.out.println("Size Of List : "+list.size());
	}
}
