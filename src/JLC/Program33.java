package JLC;
import java.util.Scanner;
public class Program33 {
	public static void main(String args[])
	{int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		//System.out.println("Number is"+rev);
	
while(rev!=0)
{int ch=rev%10;
rev=rev/10;
	switch(ch)
	{
		case 1:
			System.out.print("One\t");
			break;
		case 2:
			System.out.print("Two\t");
			break;
		case 3:
			System.out.print("Three\t");
			break;
		case 4:
			System.out.print("Four\t");
			break;
		case 5:
			System.out.print("Five\t");
			break;
		case 6:
			System.out.print("Six\t");
			break;
		case 7:
			System.out.print("Seven\t");
			break;
		case 8:
			System.out.print("Eight\t");
			break;
		case 9:
			System.out.print("Nime\t");
			break;
		case 0:
			System.out.print("Zero\t");
			break;
			
	}
	
}
}
}
