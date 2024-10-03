package kotak.loans.eduloans;

import java.util.Scanner;

public class SingleDimenssionArray 
{

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int asize = obj.nextInt();
		
		int[] a = new int[asize];
		int sum =0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = obj.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum+a[i];
		}
		System.out.println("sum of the array is : " + sum);
		
		//int[] b = new int[] {10,20,30,40};
		
	}

}
