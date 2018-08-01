package JLC;

import java.util.Scanner;

public class program39 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long fac=1;
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial of number is: "+fac);
	}

}
