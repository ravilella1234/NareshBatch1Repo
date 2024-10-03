package com.interfaces.pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File4 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String text = new String();
		String line = new String();
		while((line = br.readLine()) !=null)
		{
			text += line + "\n";
			
		}
		System.out.print(text);
		
		br.close();
	}

}
