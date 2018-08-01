package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program77 {
	public static void main(String args[])throws IOException 
	{int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.nextLine();
		System.out.println("Enter a character:");
		char a=(char)System.in.read();
		
		
		for(int i=0;i<n.length();i++)
		{ 
			 if(a==n.charAt(i)){
					 System.out.println("Character fist occured at "+i+"th index of String");
					 c++;
					 break;
			 }
			 
		}
		if(c==0)
		{
			System.out.println("Character does not occured in string");
		}
		

}
	}
