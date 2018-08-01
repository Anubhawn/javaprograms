package JLC;

import java.io.IOException;

public class Program18 {
	public static void main(String args[]) throws IOException
{

	System.out.println("Enter a character:");
	char a=(char)System.in.read();
	if(a>=48&&a<=57)
		System.out.println(a+" is a digit");
	else
		System.out.println(a+" is not a digit");
	
}


}
