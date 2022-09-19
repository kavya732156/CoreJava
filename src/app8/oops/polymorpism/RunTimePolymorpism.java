package app8.oops.polymorpism;

// run time polymorphism is achived be method overriding and auto upcasting
class Parent {
	void add() {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
}
class Child extends Parent{
	void add() 
	{
		int a=10;int b=40;
		int c=a+b;
		System.out.println(c);
	}
}
public class RunTimePolymorpism {

	public static void main(String[] args) 
	{
		Parent p=new Child(); // upcasting
		p.add();

	}

}
