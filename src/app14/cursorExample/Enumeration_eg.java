package app14.cursorExample;

// only read operation can be performed w.r.t Enemuration
// thi senumeration is applied only for legacy class i.e vector class

import java.util.*;

public class Enumeration_eg {

	public static void main(String[] args) 
	{
		Vector v=new Vector<>();
		for(int i=1;i<=10;i++) {
			v.add(i);
			}
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Integer i=(Integer)e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
