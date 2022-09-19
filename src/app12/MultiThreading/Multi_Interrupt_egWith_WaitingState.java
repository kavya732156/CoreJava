package app12.MultiThreading;

class Demo7 extends Thread{ 
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(" child thread");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Multi_Interrupt_egWith_WaitingState {

	public static void main(String[] args) 
	{
		Demo7 d=new Demo7();
		d.start();
		d.interrupt();
		for(int i=1;i<=10;i++)
			System.out.println(" Mauin Thred");

	}

}
