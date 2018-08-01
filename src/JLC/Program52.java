package JLC;

import java.util.Scanner;

public class Program52 {
	public static void main(String args[])
	{int n=0;
	double sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
	int num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			n++;
		}
		System.out.println(n);
		temp=num;
		while(temp!=0)
		{int r=temp%10;
			temp=temp/10;
			sum=sum+(Math.pow(r, n));
		}
		if(num==sum)
		{
			System.out.println("The number is armstrong: "+num);
		}
		else
			System.out.println("The number is not armstrong: "+num);
	
	}
}
