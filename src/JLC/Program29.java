package JLC;

import java.util.Scanner;

public class Program29 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int a = sc.nextInt();
		System.out.println("Enter the Month in numbers:");
		int a1 = sc.nextInt();
		
		switch (a1) {
		case 1:
			System.out.println("Number of days are 31");
			break;
		case 2: {
			if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0)
				System.out.println("Number of days are 29");
			else
				System.out.println("Number of days are 28");
		}
			break;
		case 3:
			System.out.println("Number of days are 31");
			break;
		case 4:
			System.out.println("Number of days are 30");
			break;
		case 5:
			System.out.println("Number of days are 31");
			break;
		case 6:
			System.out.println("Number of days are 30");
			break;
		case 7:
			System.out.println("Number of days are 31");
			break;
		case 8:
			System.out.println("Number of days are 31");
			break;
		case 9:
			System.out.println("Number of days are 30");
			break;
		case 10:
			System.out.println("Number of days are 31");
			break;
		case 11:
			System.out.println("Number of days are 30");
			break;
		case 12:
			System.out.println("Number of days are 31");

			break;
		default:
			System.out.println("Wrong input \nplease enter no. between 1 to 12 only");

		}
	}

}
