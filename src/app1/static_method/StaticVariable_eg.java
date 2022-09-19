package app1.static_method;
class Demo
{
	int a , b;
	static int x,y;
	
}
public class StaticVariable_eg {

	public static void main(String[] args) 
	{
		Demo d1,d2,d3;
		d1=new Demo();
		d2=new Demo();
		d1.a=10;
		d1.b=20;
		d1.x=11;
		d1.y=22;
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.x);
		System.out.println(d1.y);
		d2.a=100;
		d2.b=200;
		d2.x=111;
		d2.y=222;
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.x);
		System.out.println(d2.y);
	}

}
