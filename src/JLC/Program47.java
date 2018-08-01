package JLC;

import java.util.Scanner;

public class Program47 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long a = sc.nextLong();
		long t = a;
		int sum = 0;
		int r;
		while (a != 0) {
			r = (int)( a % 10);
			sum = sum + r;

			a = a / 10;

		}
		System.out.println("Sum of digits of " + t + " is " + sum);
	}

}
