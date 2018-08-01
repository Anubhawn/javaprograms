package JLC;

import java.util.Scanner;

public class Program43 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int a=1;
		int b=1,c;
		System.out.println("The fibonacci series is\n"+a+"\n"+b);
		for (int i = 3; i <= n; i++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		
	

}
}
