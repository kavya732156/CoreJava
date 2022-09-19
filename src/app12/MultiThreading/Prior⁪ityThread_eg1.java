package app12.MultiThreading;

class Proiority extends Thread{ 
	public void run() {
		System.out.println(" child thread");
	}
}
public class Prior⁪ityThread_eg1 
{
	public static void main(String[] args) 
	{
		Proiority p=new Proiority();
		System.out.println(p.currentThread().getPriority());
		p.setPriority(7);
		System.out.println(p.getPriority());
	}

}
