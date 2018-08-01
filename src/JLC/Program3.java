package JLC;
import java.util.Scanner;
public class Program3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String a=sc.nextLine();
		System.out.println("The string is "+a);
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
		}
		
	}

}
