package app12.MultiThreading;

class Demo6 extends Thread{ 
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(" child thread");
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

public class Multi_Sleep_eg {

	public static void main(String[] args) 
	{
		Demo6 d=new Demo6();
		d.start();
		for(int i=1;i<=10;i++) {
			System.out.println( "parent thread");
		}

	}

}
