package JLC;

import java.util.Scanner;

public class Program48 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long a = sc.nextLong();
	
		int even = 0;
		int odd=0;
		int r;
		while (a != 0) {
	
		r = (int) (a % 10);
			if(r%2==0)
			{
				even=even+r;
			}
			else
				odd=odd+r;

			a = a / 10;

		}
		System.out.println("Sum of even digits is " + even + " \tsum of odd digit is " + odd);
	}


}
