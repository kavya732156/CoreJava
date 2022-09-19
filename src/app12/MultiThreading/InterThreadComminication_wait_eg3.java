package app12.MultiThreading;
class Thread12 extends Thread{
	int total =0;
	public void run() {
		synchronized (this) {
			System.out.println(" child starts updation");
			for(int i=1;i<=100;i++) {
				total=total+i;
			}
			System.out.println(" child notification");
			this.notify();
			
		}
		
	}
}

public class InterThreadComminication_wait_eg3 {

	public static void main(String[] args) throws InterruptedException {
		Thread12 t=new Thread12();
		t.start();
		
		synchronized (t) {
			System.out.println(" main thread wants to call wait()");
			Thread.sleep(1000);
			
			t.wait();
			System.out.println("Main thread notification");
			System.out.println(" total is " + t.total);

		}
		
	}

}
