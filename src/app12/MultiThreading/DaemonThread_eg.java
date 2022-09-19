package app12.MultiThreading;

public class DaemonThread_eg {

	public static void main(String[] args) 
	{
		//System.out.println(Thread.currentThread().isDaemon()); // false'
		//Thread.currentThread().setDaemon(true);
		Thread121 t=new Thread121();
		// System.out.println(t.isDaemon());// false
		t.setDaemon(true);
		System.out.println(t.isDaemon()); // true

	}

}
class Thread121 extends Thread{
	
}
