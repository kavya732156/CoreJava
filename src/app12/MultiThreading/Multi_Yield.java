
package app12.MultiThreading;

class Demo3 extends Thread{ 
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(" child thread");
		
		
		Thread.yield();
	}
}
public class Multi_Yield {

	public static void main(String[] args) 
	{
		Demo3 d=new Demo3();
		d.start();
		for(int i=1;i<=10;i++) {
			System.out.println( "parent thread");
		}
		
	}

}
