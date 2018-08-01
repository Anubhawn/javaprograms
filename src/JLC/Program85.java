package JLC;

import java.util.Scanner;

public class Program85 {
	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=sc.nextLine();
	String b="";
	for(int i=a.length()-1;i>=0;i--)
	{
		b=b+a.charAt(i);
	}
	if(a.equals(b))
	System.out.println("String is Pallindrome: "+b);
	else
		System.out.println("String is not pallindrome: "+b);
	
	}

}
