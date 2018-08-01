package JLC;

import java.util.Scanner;

public class Program74 {
	public static void main(String args[])
	{char a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.nextLine();
		int len=n.length();
		a=new char[len];
		for(int i=0;i<len;i++)
		{ 
			 a[i]=n.charAt(i);
		}
		System.out.println("The array is: ");
		for(int i=0;i<len;i++)
		{ 
			System.out.println(a[i]);
		}
		
			
}
}
