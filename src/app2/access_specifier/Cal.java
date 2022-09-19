package app2.access_specifier;

public class Cal 
{
	int a,b ;
	public int add(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	protected int sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
		return c;
		
	}
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
		return c;
	}
	 int div(int a, int b) {
		int c=a/b;
		System.out.println(c);
		return c;
	}

	}
