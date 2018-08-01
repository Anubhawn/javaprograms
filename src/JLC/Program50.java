package JLC;

import java.util.Scanner;

public class Program50 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long a = sc.nextLong();
		long t = a;
		long rev = 0;
		long r;
		while (a != 0) {
			r = a % 10;
			rev = ((rev*10) + r);

			a = a / 10;

		}
		System.out.println("Reverse of digits of " + t + " is " + rev);
	}


}
