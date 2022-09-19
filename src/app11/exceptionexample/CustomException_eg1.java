package app11.exceptionexample;

import java.util.Scanner;
class ALessThanBException extends Exception{
	ALessThanBException(){
		System.out.println("a less than b ");
	}
}
public class CustomException_eg1 {

	public static void main(String[] args)
	
	{
		int a, b,c ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		try 
		{
			if(a>b) {
				c=a-b;
				System.out.println(c);
			}
			else {
				ALessThanBException e=new ALessThanBException();
				throw e;
				
			}
			
		} 
		catch (ALessThanBException e) 
		{
			System.out.println("Can't subtract");
		}
		System.out.println("Execting main normally");

	}

}
