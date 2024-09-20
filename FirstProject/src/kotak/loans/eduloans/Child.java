package kotak.loans.eduloans;

class Parent
{
	public Number workhard()
	{
		System.out.println("Parent : wakeup early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care");	
	}
	
}

public class Child extends Parent
{
	
	public  Number workhard()
	{
		System.out.println("Child : wakeup anytime, goto bar");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love..");
	}

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workhard();
		c.care();
		c.love();
	}

}
