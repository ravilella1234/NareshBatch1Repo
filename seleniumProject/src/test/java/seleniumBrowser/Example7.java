package seleniumBrowser;

import java.util.Date;
import java.util.Random;

public class Example7 
{

	public static void main(String[] args) 
	{
		String userName = "qatest";
		String domainName = "@gmail.com";
		
		Random r = new Random();
		int rnum = r.nextInt(999);
		//int rnum = r.nextInt();
		
		System.out.println(userName+rnum+domainName);
		
		
		Date dt = new Date();
		String d = dt.toString().replace(" ", "").replace(":", "");
		
		System.out.println(d+domainName);
	}

}
