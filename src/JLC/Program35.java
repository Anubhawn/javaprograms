package JLC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program35 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int num=Integer.parseInt(bf.readLine());
		System.out.println("The table for "+num);
		for(int i=1;i<=10;i++)
			System.out.println(num+" * "+i+" = "+i*num);
		{
			
		}
	}

}
