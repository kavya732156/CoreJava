package app11.exceptionexample;

import java.util.Scanner;

public class SystemExit_eg {

	public static void main(String[] args) 
	{
		int a, b,c ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		try {
			System.out.println("Try block executed");
			c=a/b;
			System.out.println(c);
			System.exit(0);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception caught an main");
		} 
		finally {
			System.out.println("Finally block excuted");
		}
		System.out.println("Existing the main normally");

	}

}
