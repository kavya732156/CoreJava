package app12.MultiThreading;
class Thread11 extends Thread{
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

public class InterThreadComminication_wait_eg2 {

	public static void main(String[] args) throws InterruptedException {
		Thread11 t=new Thread11();
		t.start();
		synchronized (t) {
			System.out.println(" main thread wants to call wait()");
			t.wait();
			System.out.println("Main thread notification");
			System.out.println(" total is " + t.total);

		}
		
	}

}
