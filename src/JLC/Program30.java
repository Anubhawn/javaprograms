package JLC;

import java.util.Scanner;

public class Program30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("The natural numbers till " + n + " are");
		for (int i = 1; i <= n; i++)
			System.out.println(i);
	}

}
