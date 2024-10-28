package seleniumBrowser;

public class DateDemo 
{

	public static void main(String[] args) 
	{
        String input = "Oct 2024 "
        		+ "3 holidays";
        
        // Use regular expression to extract the date part
        String date = extractDate(input);
        
        // Print the extracted date
        System.out.println("Extracted Date: " + date);
    }

    public static String extractDate(String input) 
    {
        // Define a regex pattern to match "Month Year" format (e.g., "Oct 2024")
        String pattern = "^[A-Za-z]{3} \\d{4}";
        
        // Use the pattern to find the match
        if (input.matches(pattern + ".*")) {
            return input.split(" ")[0] + " " + input.split(" ")[1];
        }
        
        return ""; // Return an empty string if no match is found
    }

}
