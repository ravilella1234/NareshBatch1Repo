package kotak.loans.eduloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(1744, "ravi", 13.45f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	void m3()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
