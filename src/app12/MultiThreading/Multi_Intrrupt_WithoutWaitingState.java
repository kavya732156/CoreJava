package app12.MultiThreading;

class Demo8 extends Thread{ 
	public void run() {
		for(int i=1;i<=10;i++) {
			
			System.out.println(" child thread");
		}
		System.out.println(" child wants to sleep");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(" child is intruppeted");
		}
	}
}


public class Multi_Intrrupt_WithoutWaitingState {

	public static void main(String[] args)
	{
		Demo8 d=new Demo8();
		d.start();
		d.interrupt();
		for(int i=1;i<=10;i++)
			System.out.println(" Mauin Thred");

	}
}

