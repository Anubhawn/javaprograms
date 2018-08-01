package JLC;

import java.util.Scanner;

public class Program10 {
	public static void main(String args[])
	{int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenhite:");
		int F=sc.nextInt();
		 c=(F-32)*5/9;
		
System.out.println("The Temperature in Celsius: "+c);
}
}