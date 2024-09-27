package kotak.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
		h.ministatement();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in HDFC");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in HDFC");
	}
	
	public void ministatement()
	{
		System.out.println("HDFC ministatement");
	}

}
