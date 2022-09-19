package app8.oops.Inheritance;
// java does not support for cyclic inheritance

class A {
	A(){
		System.out.println(" A constructor executed ");
	}
	class B extends A {
		B(){
			System.out.println(" B constructor executed ");
		}
	}
	class C extends B {
		C(){
			System.out.println(" C constructor executed ");
		}
	}
}
public class CyclicInheritnce {

	public static void main(String[] args) 
	{
		C c1=new C(); // causes the cyclic inheritance

	}

}
