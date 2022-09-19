package app7.methods;

class Demo{
	void add() {
		int a,b,c;
		a=10;b=20;
		c=a+b;
		System.out.println(c);
	}
	void add(int a) {
		int b,c;
	     b=20;
		c=a+b;
		System.out.println(c);
	}
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void add(float a ) {
		float b=20f;
		float c=a+b;
		System.out.println(c);
	}
	
}
public class Method_Overloading {

	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.add();
		d.add(10);
		d.add(10, 20);
		d.add(30f);
		

	}

}
