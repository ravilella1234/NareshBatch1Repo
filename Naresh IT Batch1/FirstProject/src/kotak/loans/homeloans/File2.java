package kotak.loans.homeloans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			Thread.sleep(1000);
		}
		sc.close();
	}

}