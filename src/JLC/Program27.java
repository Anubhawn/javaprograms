package JLC;

import java.io.IOException;
import java.util.Scanner;

public class Program27 {
	public static void main(String args[])throws IOException
	{
		
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char a=(char)System.in.read();
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
{
	System.out.println("Character is vowel:"+a);
}
else
	System.out.println("Character is Consonant:"+a);

}
}
