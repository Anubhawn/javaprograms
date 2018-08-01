package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program79 {
	public static void main(String args[])throws IOException 
	{int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.nextLine();
		System.out.println("Unique Character are:");
		
		for(int i=0;i<n.length();i++)
		{ c=0;
			for(int j=0;j<n.length();j++)
		{
			 if(n.charAt(i)==n.charAt(j)){
					 
					 c++;
					 
			 }
			 
		}
		if(c==1)
		{
			System.out.println(n.charAt(i));
		}
		

}
	}
}
