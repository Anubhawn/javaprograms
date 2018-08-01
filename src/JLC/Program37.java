package JLC;

import java.util.Scanner;

public class Program37 {
	public static void main(String args[])
	{int rem=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Enter the from which you want to devide the no.");
		int div=sc.nextInt();
		rem=num-(num/div)*div;
		
		System.out.println("The reminder  is "+rem);
		}
}
