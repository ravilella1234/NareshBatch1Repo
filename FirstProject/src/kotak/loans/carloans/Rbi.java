package kotak.loans.carloans;

public interface Rbi 
{
	
	int x = 10;
	
	public void withdrawl();
	public void deposit();
	
	public default void ministatement()
	{
		login();
		savingAccount();
		System.out.println("implement code");
	}
	
	public static void savingAccount()
	{
		login();
		System.out.println("static savingAccount");
	}
	
	private static void login()
	{
		System.out.println("iam login");
	}
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i ;
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
	}
}
