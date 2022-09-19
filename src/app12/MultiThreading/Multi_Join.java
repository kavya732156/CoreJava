package app12.MultiThreading;

class Demo4 extends Thread{ 
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(" child thread");
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

public class Multi_Join {

	public static void main(String[] args) throws InterruptedException
	{
		Demo4 d=new Demo4();
		d.start();
		// d.join();
		d.join(200);
		
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread");

		
	}

}
