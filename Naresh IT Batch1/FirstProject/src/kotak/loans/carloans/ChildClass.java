package kotak.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overriding method in ChildClass");
	}

}
