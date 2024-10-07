package kotak.loans.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		
		Iterator<Integer> ele = a.iterator();
		
		while(ele.hasNext())
		{
			Integer val = ele.next();
			if(val%2==0)
				System.out.println(val);
			else
				ele.remove();
		}
		System.out.println(a);
	}

}
