package app12.MultiThreading;

class Table2{
        void  printTable(int n) {
        	// 1000 lines of code 
        	synchronized (this) {
        		for(int i=1;i<=5;i++)
        			System.out.println( n+ " X " + i + " = " +n*i + "  " +Thread.currentThread().getName());
        		System.out.println();
			}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class MyThreadDemo extends Thread
{

	Table2 t;
	MyThreadDemo (Table2 t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	
}
public class Multi_SynchronizationBlock_eg {

	public static void main(String[] args) {
		
		
		// it will achieve synchronization because of both are pointing to same obj 
				/*
				Table2 obj= new Table2();
				MyThread t1=new MyThread(obj);
				MyThread t2=new MyThread(obj);
				t1.start();
				t2.start();*/
		
		// it will  not achieve synchronization because of both are pointing to different  obj 
		
		Table2 obj1= new Table2();
		Table2 obj2= new Table2();
		MyThreadDemo t1=new MyThreadDemo(obj1);
		MyThreadDemo t2=new MyThreadDemo(obj2);
		t1.start();
		t2.start();

	}

}
