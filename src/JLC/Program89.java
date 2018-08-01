package JLC;

import java.util.Scanner;

public class Program89 {
	public static void main(String args[])

	{ Scanner sc=new Scanner(System.in);
		int n;
	System.out.print("Enter no. of elements you want in array:");
    n = sc.nextInt();
    int a[] = new int[n+1];
    System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
        a[i] = sc.nextInt();
    }
		
		System.out.println("Enter the Element to add in aray:");
		int elem=sc.nextInt();
		System.out.println("Enter the index value where you want to add the element");
		int index=sc.nextInt();
		for(int i=a.length-1;i>=0;i--)
		{
			if(i==index)
			{
				a[i]=elem;
				break;
			}
			else
				a[i]=a[i-1];
			
		}
		System.out.println("New Array is:");
		for(int i = 0; i < n+1; i++)
	    {
	        System.out.println(a[i]);
	    }
			
	}

}
