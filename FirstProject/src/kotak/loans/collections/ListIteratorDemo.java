package kotak.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("hp");
		a.add("dell");
		a.add("lenevo");
		
		System.out.println(a);
		
		ListIterator<String> ele = a.listIterator();
		while(ele.hasNext())
		{
			String val = ele.next();
			if(val.equals("dell"))
				ele.set("sony");
			else
				ele.remove();	
		}
		System.out.println(a);
	}

}
