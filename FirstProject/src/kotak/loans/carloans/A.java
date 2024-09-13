package kotak.loans.carloans;

public class A 
{
	public int x = 10;
	
	public void m1()
	{
		System.out.println("iam m1 from A");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		System.out.println(a.x);
	}

}
