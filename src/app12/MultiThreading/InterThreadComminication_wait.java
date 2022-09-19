package app12.MultiThreading;
class Thread10 extends Thread{
	int total =0;
	public void run() {
		for(int i=1;i<=100;i++) {
			total=total+i;
		}
		this.notify();
		// if 10000 lines of code 
	}
}

public class InterThreadComminication_wait {

	public static void main(String[] args) throws InterruptedException {
		Thread10 t=new Thread10();
		t.start();
		// t.sleep(1000);    total is 5050
		///t.join();   total is 5050
		t.wait();
		
		System.out.println(" total is " + t.total);

	}

}
