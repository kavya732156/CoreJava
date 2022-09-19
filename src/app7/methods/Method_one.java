package app7.methods;
// method does not accept any parameter and does not have return type
class Calculator2
{
	public void add() {
		int a=10;int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
}
public class Method_one {

	public static void main(String[] args) 
	{
		Calculator2 c1=new Calculator2();
		c1.add();
	}

}
