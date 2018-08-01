package JLC;

import java.util.Scanner;

public class Program42 {
	public static void main(String args[]) {
		int  j, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting Number:");
		int a = sc.nextInt();
		System.out.println("Enter the ending Number:");
		int b = sc.nextInt();
		for (j = a; j <= b; j++) {
			int c=0;
			for (i = 2; i < j; i++) {
				if (j % i == 0) {
					c++;
				}
			}
			if (c == 0) {
				System.out.println("Number is Prime " + j);
			}
		}
	}

}
