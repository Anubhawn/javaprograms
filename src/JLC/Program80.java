package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program80 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=sc.nextLine();
		a.trim();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
		if(a.charAt(i)==' ')
		{
			count++;
		}
		}
		System.out.println("Total number of words in String are: "+count);
}
}
