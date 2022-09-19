package app14.cursorExample;
import java.util.*;
public class Iterator_eg {

	public static void main(String[] args) 
	{
		
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.print(i + " ");
			}
			else {
				itr.remove();
			}
			
		}
		System.out.println();   //  0 2 4 6 8 10

	}

}
