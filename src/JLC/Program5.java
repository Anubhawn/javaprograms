package JLC;

import java.util.Scanner;

public class Program5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		System.out.println("Before swaping \n a="+a+"\tb="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swaping \n a="+a+"\tb="+b);
	}

}
