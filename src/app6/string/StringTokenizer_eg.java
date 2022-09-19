package app6.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer_eg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String s1=sc.nextLine();
		StringTokenizer skt=new StringTokenizer(s1, ",");
		while(skt.hasMoreTokens()) {
			String token=skt.nextToken();
			System.out.println(token);
		}

	}

}
