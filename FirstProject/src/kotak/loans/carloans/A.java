package kotak.loans.carloans;

import java.util.Date;

public abstract class A 
{
	public int x = 10;
	public final static String cname = "dell";
	
	public void m1()
	{
		System.out.println("iam m1 from A");
		x = 30;
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	static
	{
		System.out.println("iam dummy static block");
	}
	
	public abstract void m5();

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		m4();
		
		System.out.println(a.x);
	}

}
