package app6.string;

import java.util.Scanner;

public class CompareTo_eg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=sc.nextLine();
		System.out.println("enter string 2");
		String s2=sc.nextLine();
		int res;
		res=s1.compareTo(s2);
		if(res==0) {
			System.out.println("s1 and s2 are same");
		}
		else if(res>0) {
			System.out.println(" s1 is greater than s2");
		}
		else {
			System.out.println("s1 is less than s2");
		}
	}
}
