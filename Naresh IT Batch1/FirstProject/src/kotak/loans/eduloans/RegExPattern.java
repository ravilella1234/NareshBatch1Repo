package kotak.loans.eduloans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPattern 
{

	public static void main(String[] args) 
	{
		//approch 1
		Pattern p = Pattern.compile("[6789][0-9]{9}");
		Matcher m = p.matcher("5678913434");
		boolean b = m.matches();
		System.out.println(b);
		
		//approch 2
		boolean b1 = Pattern.matches("[6789][0-9]{9}", "9678913434");
		System.out.println(b1);
		
		boolean b2 = Pattern.matches("[A-Z][a-z]*[0-9][a-z]*", "Ravi3kanth");
		System.out.println(b2);
		
		boolean b3 = Pattern.matches("[A-Z][a-z \\. 0-9]+[@][a-z]+[\\.][a-z]{2,3}", "Ravilella.@gmail.com");
		System.out.println(b3);
	}
}
