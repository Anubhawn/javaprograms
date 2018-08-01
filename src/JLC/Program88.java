package JLC;

import java.util.Scanner;

public class Program88 {
	public static void main(String args[])

	{int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of aray:");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the eliments of Array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(min>a[i])
			min=a[i];
		}
		System.out.println("The minimum value in array is : "+min);
		

}

}
