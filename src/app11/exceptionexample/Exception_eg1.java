package app11.exceptionexample;

import java.util.Scanner;

public class Exception_eg1 {

	public static void main(String[] args) 
	{
		int a, b,c ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		try {
			c=a/b;
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Exception caught an main");
		} 
		System.out.println("Existing the main normally");
	}
	

}
