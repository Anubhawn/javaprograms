package JLC;

import java.util.Scanner;

public class Program53 {
	public static void main(String args[]) {
		int n = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number:");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			int temp = i;
			System.out.println("----------------------------------------------------");
			System.out.println(temp);
			while (temp != 0) {
				temp = temp / 10;
				n++;
				System.out.println(n);
			}
			
			
			System.out.println(n);
			

			temp = i;
			while (temp != 0) {
				int r = temp % 10;
				temp = temp / 10;
				
				sum = sum +(int)(Math.pow(r, n));
			}
		System.out.println(sum);
			if (i == sum) {
				System.out.println(n);
				System.out.println("The number is armstrong: " + i);
			}

		}
	}

}
