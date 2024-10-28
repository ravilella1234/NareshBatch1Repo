package seleniumBrowser;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Functionalities 
{

	public static void main(String[] args) 
	{
		/*System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.dir"));
	
		Properties p = System.getProperties();
		Set<String> ele = p.stringPropertyNames();
		Iterator<String> itr = ele.iterator();
		while(itr.hasNext())
		{
			String e = itr.next();
			System.out.println(e);
		}*/
		
		Map<String, String> env = System.getenv();
		Set<String> elee = env.keySet();
		for(String e:elee)
		{
			System.out.println(e + " ---" + env.get(e)) ;
		}
	}

}
