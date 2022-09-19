package app12.MultiThreading;

class Demo5 extends Thread{ 
	static Thread m;
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(" child thread");
		try 
		{
			m.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

public class Multi_join_eg2 {

	public static void main(String[] args) 
	{
		Demo5 d=new Demo5();
		Demo5.m=Thread.currentThread();
		d.start();
		try {
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread");
		
			d.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
