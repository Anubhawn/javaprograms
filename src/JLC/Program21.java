package JLC;

import java.io.IOException;

public class Program21 {
	public static void main(String args[]) throws IOException
	{

		System.out.println("Enter a character:");
		char a=(char)System.in.read();
		if(a>=97&&a<=122||a>=65&&a<=90||a>=48&&a<=57)
		{
			System.out.println("Character is not a special Symbol "+a);
		}
		
		else
			System.out.println("Character is a special symbol "+a);
		
	}


}
