package app12.MultiThreading;
class Demo1 extends Thread{ 
	public void run() {
		System.out.println(" child thread");
	}
}
public class PriorityThread_eg {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d.getPriority());
		d.setPriority(10);
		System.out.println(d.getPriority());

	}

}
