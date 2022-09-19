package app7.methods;

class Calculator4
{
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
}
public class Method_three {

	public static void main(String[] args) 
	{
		Calculator4 c4=new Calculator4();
		int res=c4.add(30, 50);
		System.out.println(res);
		
	}

}
