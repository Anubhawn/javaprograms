package JLC;

import java.util.Scanner;

public class Program26 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int a = sc.nextInt();
		if(a%400==0||a%4==0&&a%100!=0)
		{
			System.out.println("IT is a leap Year");
		}
		else
			System.out.println("It is not a leap Year");
	}

}
