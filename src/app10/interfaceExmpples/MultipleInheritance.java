package app10.interfaceExmpples;

interface Demo11{
	public abstract void test();
}
interface Demo12{
	public abstract void test1();
}
interface Demo13{
	public abstract void test2();

}
public class MultipleInheritance implements Demo13,Demo12,Demo11 {

	public static void main(String[] args) {

	}
	
	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void test1() {
		System.out.println("test1");		
	}

	@Override
	public void test2() {
		System.out.println("test2");		
	}

}
