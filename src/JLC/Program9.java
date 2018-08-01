package JLC;

import java.util.Scanner;

public class Program9 {
	public static void main(String args[])
	{int carry;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		while(b!=0)
		{
		carry=a&b;
		a=a^b;
		b=carry<<1;
		}
		
			System.out.println(a+" is addition of two numbers");
	}
}
