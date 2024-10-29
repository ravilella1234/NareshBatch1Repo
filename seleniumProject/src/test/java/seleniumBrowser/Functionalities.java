package seleniumBrowser;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Functionalities 
{
	
	public String[] getProjectName(String projectpath)
	{
		File f = new File(projectpath);
		String name1 = f.getName();
		String name2 = f.getParent();
		return new String[]{name1,name2};
	}
	
	public String getCurrentClassName()
	{
		return this.getClass().getSimpleName();
	}
	
	public String getCurrentPackageName()
	{
		return this.getClass().getPackageName();
	}
	
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
		
		/*Map<String, String> env = System.getenv();
		Set<String> elee = env.keySet();
		for(String e:elee)
		{
			System.out.println(e + " ---" + env.get(e)) ;
		}*/
		
		Functionalities obj = new Functionalities();
		String[] val = obj.getProjectName(System.getProperty("user.dir"));
		System.out.println(Arrays.toString(val));
		
		System.out.println(obj.getCurrentClassName());
		
		System.out.println(obj.getCurrentPackageName());
	}

}
