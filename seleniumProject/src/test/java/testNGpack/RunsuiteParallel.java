package testNGpack;

import java.util.Arrays;

import org.testng.TestNG;

public class RunsuiteParallel 
{

	public static void main(String[] args) 
	{
		//String[] s1 = new String[5];
		//String[] s2 = {"10","20","30"};
		//String[] s3 = new String[] {"10","20","30"};
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
