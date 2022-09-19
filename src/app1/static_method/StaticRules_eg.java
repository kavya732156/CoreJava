package app1.static_method;
/* 1. static block can access static variable
 * 2. static method can access static variable
 * 3. Non static block can access non static variable
 * 4. Non static method can access non static variable
 * 5.Non static block can access  static variable
 * 6. Non static method can access static variable
 * 7.static block can not access non static variable
 * 8. static method can no access non static variable/instance variable.
 */
class Demo3{
	int a,b;
	static int x,y; // static variable 

	Demo3() 
	{
	System.out.println("Demo constructor executed");
    }
	static 
	{
		System.out.println(" static block executed");
		x=10;
		y=20;
		// a=444;// compilation error rule 7
	}
	{
		System.out.println("Non static block executed");
		a=200;
		b=300;
	}
	{ 
		System.out.println("non static block can access the static variable");
		x=999;
		y=888;
	
	}
	public void NonStatic_dip() 
	{
		System.out.println("Non static method executed");
		System.out.println(a);
		System.out.println(b);
		System.out.println("non static method can access the static variable");
		System.out.println(x);
		System.out.println(y);
	}
	public static void Static_dip() 
	{
		System.out.println(" static method executed");
		System.out.println(x);
		System.out.println(y);
		// System.out.println(a); rule 8
	}
}
public class StaticRules_eg {

	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		d3.Static_dip();
		d3.NonStatic_dip();
	}

}
