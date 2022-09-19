package app4.array;

import java.util.Scanner;

public class Jagged_ThreeD_array {

	public static void main(String[] args)
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[2][][];
		 a[0]=new int[3][];
		 a[1]=new int[2][];
		 a[0][0]=new int[2];
		 a[0][1]=new int[3];
		 a[0][2]=new int[4];
		 a[1][0]=new int[4];
		 a[1][1]=new int[2];
		 System.out.println("enter array elements");
		 for(i=0;i<=a.length-1;i++) {
			 for(j=0;j<=a[i].length-1;j++) {
				 for(k=0;k<=a[i][j].length-1;k++) {
					 a[i][j][k]=sc.nextInt();
				 }
				 
			 }
		 }
		 for(i=0;i<=a.length-1;i++) {
			 for(j=0;j<=a[i].length-1;j++) {
				 for(k=0;k<=a[i][j].length-1;k++) {
					 System.out.print(a[i][j][k]+" ");
				 }
				 System.out.println();
				 
			 }
			 System.out.println();
		 }
		 System.out.println();

	}

}
