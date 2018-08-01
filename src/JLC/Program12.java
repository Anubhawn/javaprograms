package JLC;

import java.util.Scanner;

public class Program12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int a=sc.nextInt();
		if(a>=18)
		System.out.println("Person is eligible to vote: "+a);
		else
			System.out.println("Person is not eligible to vote: "+a);

}
}
