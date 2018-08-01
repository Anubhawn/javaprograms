package JLC;

import java.util.Scanner;

public class Program73 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number at " + i + " position");
			a[i] = sc.nextInt();
		}
		System.out.println("The array is: ");
		for (int i = 0; i < 5; i++) {
			int count = 0;
			for (int j = 0; j < 5; j++) {
				if (a[i] == a[j])
					count++;
			}
			System.out.println(a[i] + " occured " + count + " times");
		}
	}

}
