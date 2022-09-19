package app12.MultiThreading;
class A {
	public synchronized void m1(B b) {
		System.out.println(" Thread1 exe m1()");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Thread1 try to exe B's test ");
		b.Test();
		
	}
	public synchronized void Test() {
		System.out.println(" Inside A's Test()");
	}
}
class B {
	public synchronized void m1( A a) {
		System.out.println(" Thread 2 exe m1()");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Thread2 try to exe B's test ");
		a.Test();
		
	}
	public synchronized void Test() {
		System.out.println(" Inside B's Test()");
	}
}
class DL extends Thread{
	 A a =new A();
	 B b=new B();
	  void m() 
	 {
		 this.start();
		 a.m1(b);
		 
		 
	 }
	 public void m2() 
	 {
		 b.m1(a);
	 }
}

public class Deadlock_eg {

	public static void main(String[] args) throws InterruptedException {
		
		DL t=new DL();
		t.m();
	}
		

}
