package JLC;
import java.util.Scanner;
public class Program36 {
	public static void main(String args[])
	{int ques=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Enter the from which you want to devide the no.");
		int div=sc.nextInt();
		while(num>=div){
			num=num-div;
			ques++;
		}
		System.out.println("The quotient is "+ques);
		}
	}


