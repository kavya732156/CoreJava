package app12.MultiThreading;

import java.util.Scanner;

// program without multithreading 
 /* public class MultiThreading_eg1 {

	public static void main(String[] args) {
		System.out.println(" task 1 started");
		for(int i=1;i<=10;i++)
			System.out.print(" + ");
		System.out.println(" task1 finished");
		System.out.println(" task2 started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(" the  given no. is evem");
		else
			System.out.println(" the given no. is odd");
		System.out.println(" task2 finished");
		System.out.println(" task 3 started");
		for(int i=1;i<=10;i++)
			System.out.print(" * ");
		System.out.println(" taks3 finished");

	}

}*/

// program with multiThreading  by extending thread class


/* 
 class Task1 extends Thread{
	public void run() 
	{
		System.out.println(" task 1 started");
		for(int i=1;i<=10;i++)
			System.out.print(" + ");
		System.out.println("task1 finished");
	
}
}
class Task2 extends Thread{
	public void run() {
		System.out.println(" task2 started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(" the  given no. is evem");
		else
			System.out.println(" the given no. is odd");
		System.out.println("task2 finished");
	}
}
class Task3 extends Thread{
	public void run() {
		System.out.println(" task 3 started");
		for(int i=1;i<=10;i++)
			System.out.print(" * ");
		System.out.println("task3 finished");
	}
}
public class MultiThreading_eg1 {

	public static void main(String[] args) {
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		Task3 t3=new Task3();
		t1.start();
		t2.start();
		t3.start();
	}
}*/

// multithredaing that implements Runnable Interface

class Task1 implements Runnable{
	public void run() 
	{
		System.out.println(" task 1 started");
		for(int i=1;i<=10;i++)
			System.out.print(" + ");
		System.out.println("task1 finished");
	
}
}
class Task2 implements Runnable{
	public void run() {
		System.out.println(" task2 started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(" the  given no. is evem");
		else
			System.out.println(" the given no. is odd");
		System.out.println("task2 finished");
	}
}
class Task3 implements Runnable{
	public void run() {
		System.out.println(" task 3 started");
		for(int i=1;i<=10;i++)
			System.out.print(" * ");
		System.out.println("task3 finished");
	}
}
public class MultiThreading_eg1 {

	public static void main(String[] args) {
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		Task3 t3=new Task3();
		Thread a=new Thread(t1);
		Thread b=new Thread(t2);
		Thread c=new Thread(t3);
		a.start();
		b.start();
		c.start();
	}
}




