package JLC;

import java.util.Scanner;

public class Program34 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a = sc.nextInt();
		int t = a;
		while (a != 0) {
			int r = a % 2;
			a = a / 2;
			if(r==1)
			{System.out.println("Not a power of TWO "+t);
				break;
			}
			else if(r==0&&a==1)
			{
				System.out.println("Power of TWO "+t);
				break;
			}
			

		}
	}
		

}
