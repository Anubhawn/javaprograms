package JLC;

import java.io.IOException;

public class Program25 {
	public static void main(String args[]) throws IOException {

		System.out.println("Enter a character:");
		char a = (char) System.in.read();
		if (a >= 97 && a <= 122)
			System.out.println("Already a Lowercase Alphabet "+a);
		else if(a >= 65 && a <= 90)
		{ 
			
		System.out.println("Lowercase Alphabet is "+Character.toLowerCase(a));
		}
		else
			System.out.println("Not an Alphabet");

}
}
