package app11.exceptionexample;
class Test {
	void fun1() 
	{
		System.out.println("Inside fun1");
		
		try{
			fun2();
		}catch(Exception e) {
			System.out.println("Exception caught on fun1");
			throw e;
		}
	}
	void fun2() {
		System.out.println("inside fun2");
		int a, b, c ;
		a=10;
		b=0;
		try{
			c=a/b;
		}
		catch(Exception e) {
			System.out.println("Exception caught in fun2");
			throw e;
		}
	}
}
public class Rethrowing_eg 
{
	public static void main(String [] args) {
		Test  t =new Test();
		try 
		{
			t.fun1();
					
		} 
		 catch (Exception e)
		 {
			System.out.println("Exception caught on main");
	     }
		System.out.println("executing main normally");

	}

}
