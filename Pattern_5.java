package program;

import java.util.Scanner;

public class Pattern_5 
{

	public static void main(String[] args)
	{
		int i,j,n;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=nu.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
