package JLC;

import java.util.Scanner;

public class Program11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a>=0)
		System.out.println("Number is Positive: "+a);
		else
			System.out.println("Number is negative: "+a);

}
}
