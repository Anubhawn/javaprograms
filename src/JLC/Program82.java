package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program82 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=sc.nextLine();
		a.trim();
		System.out.println("Enter another String:");
		String b=sc.nextLine();
		b.trim();
		if(a.length()==b.length())
		{ System.out.println("Strings are Equal");
		}
		else
			System.out.println("Strings are not equal");
		

}
}
