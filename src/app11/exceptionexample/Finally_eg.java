package app11.exceptionexample;
class Mytest {
	void fun1() 
	{
		System.out.println("Connect to DB");
		
		try{
			fun2();
		}catch(Exception e) {
			System.out.println("Exception caught on fun1");
			throw e;
		}
		finally {
			System.out.println(" Disconnect the DB in fun1");
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
		finally {
			System.out.println(" Disconnect the DB in fun2");
		}
	}
}
public class Finally_eg {

	public static void main(String[] args) 
	{
			Mytest  t1 =new Mytest();
			try 
			{
				t1.fun1();
						
			} 
			 catch (Exception e)
			 {
				System.out.println("Exception caught on main");
		     }
			finally {
				System.out.println("Disconnce DB in main");
			}
			System.out.println("executing main normally");

	}

}
