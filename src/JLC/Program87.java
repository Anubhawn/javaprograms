package JLC;

import java.util.Scanner;

public class Program87 {
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
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			if(max<a[i])
			max=a[i];
		}
		System.out.println("The maximum value in array is : "+max);
		

}
}
