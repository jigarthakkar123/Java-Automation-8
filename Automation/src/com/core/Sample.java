package com.core;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pi=3.14,r,area;
		System.out.print("Enter Radius : ");
		r=sc.nextDouble();
		area=pi*r*r;
		System.out.println("Area Of Circle : "+area);
	}
}
