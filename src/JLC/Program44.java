package JLC;

import java.util.Scanner;

public class Program44 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		arr[0]=0;
		arr[1]=1;
		
		for (int i = 2; i < n; i++)
		{
		arr[i]=arr[i-2]+arr[i-1];
		
		}
		System.out.println("The nth digit of series is "+arr[n-1]);

}
}
