package com.interfaces.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		
		String text = new String();
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			text += sc.nextLine()+ "\n";
			System.out.println(text);
			Thread.sleep(1000);
		}
			//System.out.println(text);
	}

}
