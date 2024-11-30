package kotak.loans.eduloans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPattern 
{

	public static void main(String[] args) 
	{
		//approch 1 
		// Validate a Phone Number
		/*Pattern p = Pattern.compile("[6789][0-9]{9}");
		Matcher m = p.matcher("8678915347");
		boolean b = m.matches();
		System.out.println(b);
		
		
		//approch 2 
		// Validate india Phone Number
		boolean b1 = Pattern.matches("[6789][0-9]{9}", "9678913434");
		System.out.println(b1);
		
		//Validate alphanuraic string
		boolean b2 = Pattern.matches("[A-Z][a-z]+[0-9][a-z]+", "Ravi3kanth");
		System.out.println(b2);
		
		
		//Validate an Email Address
		boolean b3 = Pattern.matches("[A-Z][a-z]*[.][0-9]+[@][a-z]*[.][a-z]{2,3}", "Ravilella.1981@gmail.com");
		System.out.println(b3);
		
		
		//Validate a Date Format (DD/MM/YYYY)
		String date = "01/12/2024";
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{2,4}";
        boolean b4 = Pattern.matches(regex, date);     
        System.out.println(b4);	
        
        
        
        //Validate a Password weakpass StrongP@ssw0rd
        boolean b5 = Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}","StrongP@ssw0rd");
        System.out.println(b5);
        
        
        // Validate usa Phone Number
       boolean b6 = Pattern.matches("\\+\\d{1,3}-\\d{3}-\\d{3}-\\d{4}", "+1-123-456-7890");
       System.out.println(b6);*/
        
        
        
        // Extract Initials from a Name - "Ravi kanth" - RK
		// Validate an IPv4 Address - "192.168.0.1"
		//Extract URLs from Text - "Visit our website at https://example.com or http://test.org."
		
        
        // Replace Multiple Spaces with a Single Space
		String input = "This   is    a   test.";
        String regex = "\\s+";
        String result = input.replaceAll(regex, " ");
        System.out.println("Cleaned String: " + result);
        
        
        
        // Extract All Numbers from a String
		Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher("The order numbers are 123, 456, and 789.");
        while (matcher1.find())
        {
        	System.out.println(matcher1.group());
        }
      
       	
        // Extract Email Addresses from Text
        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+");
        Matcher matcher2 = pattern2.matcher("Contact us at support@example.com, sales@example.org, or info@example.net");
        while (matcher2.find())
        {
        	System.out.println(matcher2.group());
        }
        
        
        //Split a String Using a Regex
        String text = "apple,banana;cherry|grape";
        String regx = "[,;|]";
        System.out.println(text);
	    String[] fruits = text.split(regx);
	    for(String fruit:fruits)
	    {
	    	System.out.println(fruit);
	    }
        
       //Split a String Using a Regex
       String text1 = "apple banana cherry grape";
       String regx1 = "[\\s]";
       System.out.println(text1);
       String[] fruits1 = text1.split(regx1);
       for(String fruit1:fruits1)
       {
    	   System.out.println(fruit1);
       }
	}
}
