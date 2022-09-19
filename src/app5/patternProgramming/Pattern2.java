package app5.patternProgramming;

public class Pattern2 {

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				// System.out.print(" * "); // prints * * * * * in 5 rows 5 column
				// System.out.print(i+ " "); // prints 1 1 1 1 1 2 2 2 2 2 
				System.out.print(j+ " "); // prints 1 2 3 4 5 
			}
			System.out.println();
		}
		System.out.println();

	}

}
