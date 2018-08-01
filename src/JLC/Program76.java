package JLC;

import java.util.Scanner;

public class Program76 {
	public static void main(String args[])
	{char a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.nextLine();
		System.out.println("String in lowercase:");
		for(int i=0;i<n.length();i++)
		{ 
			 a=n.charAt(i);
			
			if(a >= 97 && a <= 122)
			{
				a=(char)(a-32);
			}
			System.out.print(a);
		}
	}

}
