package app7.methods;

class Calculator5
{
	public int add() {
		int a=10;int b=80;
		int c=a+b;
		return c;
	}
	
}
public class Method_four {

	public static void main(String[] args) 
	{
		Calculator5 c5=new Calculator5();
		int res=c5.add();
		System.out.println(res);

	}

}
