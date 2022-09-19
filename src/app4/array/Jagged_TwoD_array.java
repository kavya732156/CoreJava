package app4.array;

import java.util.Scanner;

public class Jagged_TwoD_array {

	public static void main(String[] args) 
	{
		int i ,j;
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[2];
		System.out.println("enter array elements ");
		for(i=0;i<=a.length-1;i++) {
			for(j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=a.length-1;i++) {
			for(j=0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

	}
		System.out.println();
}
}
