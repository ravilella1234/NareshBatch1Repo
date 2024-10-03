package kotak.loans.eduloans;

import java.util.Arrays;

public class ReturningArrayProgram 
{

	public int[] elements()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return new int[] {a,b,c};
	}
	
	
	public static void main(String[] args)
	{
		ReturningArrayProgram obj = new ReturningArrayProgram();
		int[] val = obj.elements();
		System.out.println(Arrays.toString(val));
	}

}
