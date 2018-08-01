package JLC;

import java.util.Scanner;

public class Program45 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long a=sc.nextLong();
		long t=a;
		int count=0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}System.out.println("number of digis of number "+t+" are "+count);
	}

}
