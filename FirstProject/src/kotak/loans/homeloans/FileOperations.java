package kotak.loans.homeloans;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOperations 
{

	public static void main(String[] args) throws Exception 
	{
		System.out.println(System.getProperty("user.dir"));
		
		/*File f1 = new File(System.getProperty("user.dir"));
		//System.out.println(Arrays.toString(f1.list()));
		System.out.println(Arrays.toString(f1.listFiles()));*/
		
		
		
		File f = new File("C:/Users/DELL/Desktop/folder1/file1.txt");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		/*File f = new File("C:/Users/DELL/Desktop/folder1/");
		//File f = new File("./file2.txt");
		String[] arr = f.list();
		for(String a:arr)
		{
			System.out.println(a);
		}
		//System.out.println(Arrays.toString(f.list()));
		
		
		/*File f = new File("C:/Users/DELL/Desktop/A/B/C");
		//f.mkdir();
		f.mkdirs();*/
		
		/*System.out.println(f.exists());
		f.delete();
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());*/
		
		/*if(f.exists())
			f.delete();
		System.out.println(f.createNewFile());*/
		
		//System.out.println(f.isHidden());
		//System.out.println(f.canWrite());
		
	}

}
