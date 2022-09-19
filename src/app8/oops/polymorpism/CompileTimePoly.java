package app8.oops.polymorpism;

// compile time poly morpism is used to achieve method overloading

class Sub{
	void sub() {
		int a,b,c;
		a=20;
		b=10;
		c=a-b;
		System.out.println(c);
	}
	void sub(int a , int b) {
		int c=a-b;
		System.out.println(c);
	}
}
public class CompileTimePoly {

	public static void main(String[] args) 
	{
		Sub s=new Sub();
		s.sub();
		s.sub(50, 20);

	}

}
