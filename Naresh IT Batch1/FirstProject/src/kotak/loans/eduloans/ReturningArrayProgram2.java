package kotak.loans.eduloans;

import java.util.Arrays;

public class ReturningArrayProgram2 
{

	public int[] elements()
	{
		int[] a= {10,20,30,40};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return a;
	}
	
	
	public static void main(String[] args)
	{
		ReturningArrayProgram2 obj = new ReturningArrayProgram2();
		int[] val = obj.elements();
		System.out.println(Arrays.toString(val));
		
	}

}
