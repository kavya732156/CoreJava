package app11.exceptionexample;
class Demo {
	void fun1() 
	{
		System.out.println("Inside fun1");
		fun2();
	}
	void fun2() {
		System.out.println("inside fun2");
		int a, b, c ;
		a=10;
		b=0;
		c=a/b;
	}
}
public class Ducking {

	public static void main(String[] args) 
	{
		Demo d =new Demo();
		try 
		{
			d.fun1();
					
		} 
		 catch (Exception e)
		 {
			System.out.println("Exception caught on main");
	     }
		System.out.println("executing main normally");

	}

}
