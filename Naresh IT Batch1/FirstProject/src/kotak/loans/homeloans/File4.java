package kotak.loans.homeloans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File4 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		int asciiNum = 0;
		String text = new String();
		String line = new String();
		//while((asciiNum = br.read()) != -1)
		while((line = br.readLine()) != null)
		{
			text = line + "\n";
			System.out.print(text);
			
			//System.out.print((char)asciiNum);
			
			Thread.sleep(1000);
		}
		br.close();
	}

}
