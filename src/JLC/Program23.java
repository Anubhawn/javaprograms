package JLC;

import java.util.Scanner;

public class Program23 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks for three subjects:");
	float sub1=sc.nextFloat();
	float sub2=sc.nextFloat();
	float sub3=sc.nextFloat();
	float sum=sub1+sub2+sub3;
	System.out.println("The total marks are:"+sum);
	float avg=sum/3;
	System.out.println("The average marks are:"+avg);
	float per=sum*100/300;
	if(per>=80)
	System.out.println("Grade:  A \nRemark  :Excellent");
	else if(per>=70&&per<=80)
		System.out.println("Grade:  B \nRemark  :Very Good");
	else if(per>=60&&per<=70)
		System.out.println("Grade:  C \nRemark  :Good");
	else if(per>=50&&per<=60)
	System.out.println("Grade:  D \nRemark  :Satisfactory");
	else if(per<50)
		System.out.println("Grade:  E \nRemark  :Failure Try Again!!");
		
}
}
