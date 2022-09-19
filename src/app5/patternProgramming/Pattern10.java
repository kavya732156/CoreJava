package app5.patternProgramming;

public class Pattern10 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) {
			for(int space=1;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(5-i+1)+1;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
