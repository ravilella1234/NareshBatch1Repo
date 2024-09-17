package kotak.loans.eduloans;

public class TypeCasting 
{
	

	public static void main(String[] args) 
	{
		
		// byte-1,short-2, int-4,long-8,float-4,double-8
		
		//1 ltr ---> 500 ml ---> there is no data loss --> widining
		//1 ltr ---> 1.5ltr ---> there is data loss (water overflow) --> Narrowing
		
		
		//Typecasting from 1-primitive type to other primitive type
		
		int x1 = 97;
		System.out.println(x1);
		
		double x2 = x1;
		System.out.println(x2);
		
		int x3 = (int)x2;
		System.out.println(x3);
		
		char x4 = (char)x1;
		System.out.println(x4);
		
		//Typecasting from 1-primitive type to corresponding wrapper class type
		
		int p1 = 10;
		System.out.println(p1);
		
		Integer p2 = Integer.valueOf(p1);
		System.out.println(p2);
		
		int p3 = (int)p2;
		System.out.println(p3);
		
		//Typecasting from 1-wrapper class type to another wrapper class type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		System.out.println(i1+i2);
		
		Integer c1 = Integer.valueOf(i1);
		Integer c2 = Integer.valueOf(i2);
	}
}
