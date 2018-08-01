package JLC;

import java.io.IOException;

public class Program22 {
	public static void main(String args[]) throws IOException {

		System.out.println("Enter a character:");
		char a = (char) System.in.read();
		if (a >= 65 && a <= 90)
			System.out.println("Character is a Uppercase Alphabet "+a);
		else if (a >= 97 && a <= 122)
			System.out.println("Character is a LowerCase Alphabet "+a);
		else if (a >= 48 && a <= 57)
			System.out.println("Character is a digit "+a);

		else
			System.out.println("Character is a special symbol "+a);

	}

}
