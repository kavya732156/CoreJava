package app12.MultiThreading;
 // Multi theading w.r.t By extending the Thread class
 
class Multi extends Thread
{
	public void run() {
		System.out.println("Threading is running");
	}
	
}


// Multi theading w.r.t By implementing the Runnable interface
 
class Multi1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Threading is running");
	}
	
}

public class MultiThreading_waysToCreateThread {

	public static void main(String[] args) 
	{
		Multi m=new Multi();
		m.start();  //by extend thread 
		
		
		Multi1 m1=new Multi1();
		Thread t=new Thread(m1);
		t.start();// by implementssing the runnable interface

	}

}
