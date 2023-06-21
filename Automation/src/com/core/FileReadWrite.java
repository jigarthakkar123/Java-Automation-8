package com.core;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("tops11.txt");
		fw.write("This is file writer/reader demo using java.");
		fw.flush();
		fw.close();
		System.out.println("File Writen Successfully");
		
		FileReader fr=new FileReader("tops11.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
