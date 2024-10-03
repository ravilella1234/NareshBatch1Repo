package com.interfaces.pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File5 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int asciiNum = 0;
		String text = new String();
		
		while((asciiNum = br.read()) != -1)
		{
			text += String.valueOf((char)asciiNum);
		}
		System.out.print(text);
		
		br.close();
	}

}
