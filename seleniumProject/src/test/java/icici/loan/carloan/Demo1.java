package icici.loan.carloan;

import java.io.File;
import java.util.Arrays;

import seleniumBrowser.Functionalities;

public class Demo1 
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
	
	public String getSplittedPackageName()
	{
		String packName = this.getClass().getPackageName();
		String[] sString = packName.split("\\.");
		for(int i=0;i<sString.length;i++)
		{
			if(!sString[i].equals(sString.length-1))
			{
				System.out.println(sString[i]);
			}	
		}
		return sString;
	}
	
	public static void main(String[] args) 
	{
		
		Demo1 obj = new Demo1();
		String[] val = obj.getProjectName(System.getProperty("user.dir"));
		System.out.println(Arrays.toString(val));
		
		System.out.println(obj.getCurrentClassName());
		
		System.out.println(obj.getCurrentPackageName());
		
		obj.getSplittedPackageName();
	}

}
