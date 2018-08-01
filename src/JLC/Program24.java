package JLC;

import java.io.IOException;

public class Program24 {
	public static void main(String args[]) throws IOException {

		System.out.println("Enter a character:");
		char a = (char) System.in.read();
		if (a >= 65 && a <= 90)
			System.out.println("Already a Uppercase Alphabet "+a);
		else if(a >= 97 && a <= 122)
		{ 
			
		System.out.println("Uppercase Alphabet is "+Character.toUpperCase(a));
		}
		else
			System.out.println("Not an Alphabet");

}
}
