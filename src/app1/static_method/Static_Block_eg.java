package app1.static_method;

class Demo1{
	int a,b;
	static int x,y;

	Demo1() 
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
}
public class Static_Block_eg {

	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.a=10;
		d1.b=20;
		d1.x=11;
		d1.y=22;
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.x);
		System.out.println(d1.y);
	}

}
