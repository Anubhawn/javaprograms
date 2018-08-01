package JLC;

import java.util.Scanner;

public class Program68 {
	public static void main(String args[]) {
		int num = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in String Form:");
		String a = sc.next();

		if (a.charAt(0) == '-') {
			i = 1;

		}
		while (i < a.length()) {

			num = num * 10;

			num = num + (a.charAt(i) - '0');
			;
			i++;

		}
		if (a.charAt(0) == '-') {
			num = -(num);

		}
		System.out.println("Number is :" + num);

	}
}
