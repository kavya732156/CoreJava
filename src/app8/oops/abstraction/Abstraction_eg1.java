package app8.oops.abstraction;

abstract class A{
	        public String name="raj";
			abstract public void test();
			public void test1() {
				System.out.println("test1");
			}
			void A() {
				System.out.println("A constructor");
			}
}
public class Abstraction_eg1 extends A {

	public static void main(String[] args) 
	{
		A a=new Abstraction_eg1();
		a.test();
		a.test1();
	}

	@Override
	public void test() {
		System.out.println("Test");
	}


}
