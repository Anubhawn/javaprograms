package JLC;

import java.util.Scanner;

public class Program40 {
	public static void main(String args[]) {
		int c=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int a = sc.nextInt();
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			c++;
		}
	}
	if(c==0)
	{
		System.out.println("Number is Prime "+a);
	}
	else
	{
		System.out.println("Number is not Prime "+a);
	}

}
}
