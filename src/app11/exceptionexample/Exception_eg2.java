package app11.exceptionexample;

import java.util.Scanner;

public class Exception_eg2 {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=1;i<=a.length;i++) {
			System.out.println("enter array eleemnet");
			a[i]=sc.nextInt();
		}
		try {
			for(i=0;i<10;i++) {
				System.out.println(a[i]+" ");
			}
			
		} catch (Exception e) 
		{
			System.out.println(" ");
		}
		System.out.println("Exception caught by main method");

	}

}
