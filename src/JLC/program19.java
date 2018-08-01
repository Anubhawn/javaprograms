package JLC;

import java.io.IOException;

public class program19 {
	public static void main(String args[]) throws IOException
{

	System.out.println("Enter a character:");
	char a=(char)System.in.read();
	if(a>=97&&a<=122||a>=65&&a<=90)
	{
		if(a>=65&&a<=90)
			System.out.println("Character is a UpperCase Alphabet "+a);
		else
			System.out.println("Character is not a uppercase Alphabet "+a);
	}
	
	else
		System.out.println("Not a Alphabet");
	
}


}
