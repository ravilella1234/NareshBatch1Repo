package kotak.loans.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(1000, 100);
		h.put(20, 200);
		h.put(100, 300);
		h.put(3, 200);
		h.put(9, 400);
		
		System.out.println(h);
		System.out.println(h.get(10));
		
		Set<Integer> keys = h.keySet();
		
		for(Integer key : keys)
		{
			System.out.println(key + "----"+ h.get(key));
		}
		
		
		Set<Entry<Integer, Integer>> val = h.entrySet();
        System.out.println("entries : " + val);
	}

}
