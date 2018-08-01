package JLC;

import java.util.Scanner;

public class Program28 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number[0-6]:");
		int a = sc.nextInt();
		switch(a)
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thurseday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		default:
			System.out.println("Wrong input \nplease enter no. between 0 to 6 only");
		
		
		}
	}

}
