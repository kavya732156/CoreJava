package app2.access_specifier;
public class Calculator {

	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.add(20,30);
		c.sub(100,50);
		//c.mul(5,5);
		c.div(10,5);
	
		c.mul(10,5);
	}
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
	private int div(int a, int b) {
		int c=a/b;
		System.out.println(c);
		return c;
	}

}
