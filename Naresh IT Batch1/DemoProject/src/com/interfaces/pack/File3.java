package com.interfaces.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File3 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		FileReader fr = new FileReader(f);
		int asciiNum = 0;
		String text = new String();
		
		while((asciiNum = fr.read()) != -1)
		{
			text += String.valueOf((char)asciiNum);
			System.out.print((char)asciiNum);
			Thread.sleep(1000);
		}
			
		
		System.out.print(text);
		fr.close();
	}

}
