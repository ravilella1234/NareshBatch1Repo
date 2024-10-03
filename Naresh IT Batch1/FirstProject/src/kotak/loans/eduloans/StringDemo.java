package kotak.loans.eduloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String p1 = "ravikanth";
		System.out.println(p1);
		System.out.println(p1.length());
		System.out.println(p1.charAt(2));
		System.out.println(p1.indexOf('v'));
		
		System.out.println(p1.startsWith("r"));
		System.out.println(p1.endsWith("nth"));

		String p2 = new String("lella");
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		String p3 = "Ravikanth";
		System.out.println(p3);
		System.out.println(p1.equals(p3));
		System.out.println(p1.equalsIgnoreCase(p3));
		
		String p4 = "Ravi";
		System.out.println(p4);
		System.out.println(p1.equals(p4));
		System.out.println(p1.equalsIgnoreCase(p4));
		System.out.println(p1.contains(p4.toLowerCase()));
		
		String p5 = "ravikanth";
		System.out.println(p5);
		System.out.println(p5.toUpperCase());
		System.out.println(p5.toLowerCase());
		
		System.out.println(p1+p2);
		System.out.println(p1.concat(p2));
		
		String p6 = " ravikanth";
		System.out.println(p6);
		System.out.println(p6.trim());
		System.out.println(p1.equals(p6));
		System.out.println(p1.equals(p6.trim()));
		
		String p7 = " Ravi";
		System.out.println(p7);
		System.out.println(p1.equals(p7));
		System.out.println(p1.equalsIgnoreCase(p7));
		System.out.println(p1.contains(p7));
		System.out.println(p1.contains(p7.trim().toLowerCase()));
		
		System.out.println(p1.substring(2, 7));
		
		System.out.println(p1.replace('r', 'k'));
		
		String p8 = "ravi kanth lella";
		System.out.println(p8);
		String[] p9 = p8.split(" ");
		for(String p:p9)
		{
			System.out.println(p);
		}
	}

}
