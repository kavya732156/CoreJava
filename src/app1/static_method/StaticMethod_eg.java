package app1.static_method;

class Demo2{
	int a,b;
	static int x,y;

	Demo2() 
	{
	System.out.println("Demo constructor executed");
    }
	static 
	{
		System.out.println(" static block executed");
	}
	{
		System.out.println("Non static block executed");
	}
	public void NonStatic_dip() 
	{
		System.out.println("Non static method executed");
	}
	public static void Static_dip() 
	{
		System.out.println(" static method executed");
	}
}
public class StaticMethod_eg {

	public static void main(String[] args) 
	{
		Demo2 d2=new Demo2();
		d2. Static_dip();
		d2. NonStatic_dip();
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.x);
		System.out.println(d2.y);
		
		/* instance variables or instance methods are accessed by only reference variable 
		 * not by class class variable
		 */
		d2.a=20;
		d2.b=30;
		System.out.println(d2.a);
		System.out.println(d2.b);
		// Demo2.class=33; // its shows compilation error
		
		/* static variables or static methods are accessed by  reference variable 
		 * and bt class class variable
		 */
		//d2.x=200;
		//d2.y=300;
		Demo2.x=400;
		Demo2.y=500;
		System.out.println(d2.x);
		System.out.println(d2.y);
		System.out.println(Demo2.x);
		System.out.println(Demo2.y);
		

	}

}
