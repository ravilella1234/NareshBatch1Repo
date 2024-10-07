package kotak.loans.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration<Integer> ele = v.elements();
		
		while(ele.hasMoreElements())
		{
			Integer val = ele.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		System.out.println(v);
	}

}
