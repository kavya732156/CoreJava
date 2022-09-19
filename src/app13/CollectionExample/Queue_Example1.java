package app13.CollectionExample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Queue_Example1 {

	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(80);
		l.add(60);
		System.out.println(l); // [10, 20, 50, 80, 60]
		 
		// Queue  methods with Priority Queue Method 
		PriorityQueue p=new PriorityQueue();
		p.add(100);
		p.addAll(l);
		p.offer(22);
		p.offer(33);
		System.out.println(p); // [10, 33, 20, 50, 80, 60, 22, 100]
		System.out.println(p.peek()); // 10 returns 1st elemnt in queue
		System.out.println(p.element()); // 10 
		System.out.println(p.poll()); // 10 removes 1st element
		System.out.println(p); // [20, 33, 22, 50, 80, 60, 100]
		System.out.println(p.remove()); // 20 
		
		// De-queue interfsce  methods with ArrayDeque
		ArrayDeque ad=new ArrayDeque();
		ad.addAll(p);
		System.out.println(ad); // [22, 33, 60, 50, 80, 100]
		ad.addFirst("raja");
		ad.addLast("krishna");
		System.out.println(ad); // [raja, 22, 33, 60, 50, 80, 100, krishna]
		System.out.println(ad.offerFirst(10));
		System.out.println(ad.offerLast("raja"));
		System.out.println(ad.getFirst()); //10
		System.out.println(ad.getLast()); //raja 
		System.out.println(ad.pollFirst()); //10
		System.out.println(ad.pollLast()); // raja
		System.out.println(ad.removeFirst()); // raja
		System.out.println(ad.removeLast()); // krishna
		System.out.println(ad); // [22, 33, 60, 50, 80, 100]
		

	}

}
