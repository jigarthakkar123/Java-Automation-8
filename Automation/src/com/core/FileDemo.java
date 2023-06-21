package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("d:\\tops\\tops2.txt");
		String s="This is file output stream demo using java1";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written Successfully");
		
		FileInputStream fis=new FileInputStream("d:\\tops\\tops2.txt");
		int i;
		String str="";
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
			str=str+(char)i;
		}
		fis.close();
		System.out.println();
		System.out.println("String Is : "+str);
		
		FileOutputStream fos1=new FileOutputStream("d:\\tops\\tops3.txt");
		byte b1[]=str.getBytes();
		fos1.write(b1);
		fos1.flush();
		fos1.close();
		System.out.println("File Written Successfully");
	}
}
