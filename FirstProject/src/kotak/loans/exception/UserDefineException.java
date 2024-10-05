package kotak.loans.exception;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String name;
		Scanner obj = new Scanner(System.in);
		
	
		while (true) 
		{
			System.out.println("Enter the 10 character String : ");
			name = obj.next();
			try 
			{
				if (name.length() != 10)
				{
					throw new UserDefineException("Enter the 10 character String ");
				}
				else 
				{
					System.out.println(name);
					break;
				}
			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
