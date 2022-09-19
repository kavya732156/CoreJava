package app12.MultiThreading;

class Table{
	static synchronized void  printTable(int n) {
		for(int i=1;i<=5;i++)
			System.out.println( n+ " X " + i + " = " +n*i + "  " +Thread.currentThread().getName());
		System.out.println();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyThread extends Thread
{

	Table t;
	MyThread (Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	
}
public class Multi_SynchronizationMethod_eg1 {

	public static void main(String[] args) {
		// it will achieve synchronization because of both are pointing to same obj 
		/*
		Table obj= new Table();
		MyThread t1=new MyThread(obj);
		MyThread t2=new MyThread(obj);
		t1.start();
		t2.start();*/
	
		// it will  not achieve synchronization because of both are pointing to different  obj 
		
		Table obj1= new Table();
		Table obj2= new Table();
		MyThread t1=new MyThread(obj1);
		MyThread t2=new MyThread(obj2);
		t1.start();
		t2.start();

	}

}
