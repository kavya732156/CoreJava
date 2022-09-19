package app4.array;

import java.util.Scanner;

public class TwoD_array {

	public static void main(String[] args) 
	{
		int i,j;
		int a1[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=a1.length-1;i++)
		{
			for(j=0;j<=a1[i].length-1;j++)
			{
				System.out.println("enter array elements ");;
				a1[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=a1.length-1;i++)
		{
			for(j=0;j<=a1[i].length-1;j++)
			{
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}


	}

}
