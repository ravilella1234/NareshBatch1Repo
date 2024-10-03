package kotak.loans.eduloans;

public class DataTypes 
{
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	boolean bb;
	char ch;
	
	String str;
	
	static String cname ;
	static float roi;

	public static void main(String[] args) 
	{
		int x=10;
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte : " + obj.b);
		System.out.println("Short : " + obj.s);
		System.out.println("Int : " + obj.i);
		System.out.println("Long : " + obj.l);
		
		System.out.println("Float : " + obj.f);
		System.out.println("Double : " + obj.d);
		
		System.out.println("Boolean : " + obj.bb);
		System.out.println("Char : " + obj.ch);
		
		System.out.println("str : " + obj.str);
		
		System.out.println("cname : " + cname);
		System.out.println("roi : "+ roi);
		
		System.out.println("X :"+ x );
	}

}
