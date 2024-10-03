package kotak.loans.eduloans;

public class Student 
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student(1744, "kiran");
		//System.out.println(s1.sno);
		//System.out.println(s1.sname);
		System.out.println(s1);
	}
	
	
}
