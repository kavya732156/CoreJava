package app12.MultiThreading;
class demo extends Thread{ 
	public void run() {
		System.out.println(" child thread");
	}
}
public class MultiTask_Getname_setName_eg1 {
	
	
public static void main(String[] args) 
{
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("pentagon");
	
	System.out.println(Thread.currentThread().getName());
	
	demo t=new demo();
	System.out.println(t.getName());
	t.setName("punith");
	System.out.println(t.getName());
	

}
}

