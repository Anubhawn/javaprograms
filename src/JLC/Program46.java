package JLC;

import java.util.Scanner;

public class Program46 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long a = sc.nextLong();
		int odd = 0;
		int even = 0;
		int r;
		while (a != 0) {
			r = (int) (a % 10);
			if (r % 2 == 0)
				even++;
			else
				odd++;
			a = a / 10;

		}
		System.out.println("number of even digis are " + even + " number of odd degits are " + odd);
	}

}
