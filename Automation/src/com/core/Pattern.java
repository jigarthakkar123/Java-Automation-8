package com.core;

public class Pattern {

	public static void main(String[] args) throws InterruptedException {
		int i,j,k,l;
		for(i=1;i<10;i++)
		{
			for(k=1;k<10-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				Thread.sleep(1000);
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
