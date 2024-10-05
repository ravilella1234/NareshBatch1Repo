package kotak.loans.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,output;
		Scanner sc = new Scanner(System.in);
				
		while (true) 
		{
			System.out.println("Enter nr value :");
			nr = sc.nextInt();
			System.out.println("Enter dr value :");
			dr = sc.nextInt();
			
			try 
			{
				output = nr / dr;
				System.out.println(output);
				break;
			} 
			
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam final block...");
			}
			
			
		}
	}

}
