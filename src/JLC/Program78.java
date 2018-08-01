package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program78 {
	public static void main(String args[]) throws IOException {
		int c = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String n = sc.nextLine();
		System.out.println("Enter a character:");
		char a = (char) System.in.read();

		for (int i = 0; i < n.length(); i++) {
			if (a == n.charAt(i)) {
				c = i;
			}
			if (c != -1 && i == n.length() - 1) {
				System.out.println("Character Last occured at " + c + "th index of String");
				break;
			}
			else if(c==-1&&i==n.length()-1)
			{
				System.out.println("Character not fount in String");
			}
		}
	}

}
