package JLC;


import java.util.Scanner;

public class Program84 {
	public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String a=sc.nextLine();
String b="";
for(int i=a.length()-1;i>=0;i--)
{
	b=b+a.charAt(i);
}
System.out.println("The reverse String is: "+b);
}
}
