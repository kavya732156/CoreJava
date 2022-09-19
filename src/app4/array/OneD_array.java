package app4.array;

import java.util.*;

public class OneD_array {

	public static void main(String[] args) 
	{
		int i;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry elements");
		for( i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<=a.length-1;i++) {
			System.out.println("array elemnts " + a[i]);
		}

	}

}
