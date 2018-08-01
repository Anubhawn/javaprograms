package JLC;

import java.util.Scanner;

public class program31 {
	public static void main(String args[]) {
		long sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
			sum=sum+i;
	
	
	System.out.println("The sum of natural numbers till " + n + " is "+sum);


}
}
