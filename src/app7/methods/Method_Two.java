package app7.methods;

class Calculator3
{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
}
public class Method_Two {

	public static void main(String[] args) 
	{
		Calculator3 c3=new Calculator3();
		c3.add(10, 20);

	}

}
