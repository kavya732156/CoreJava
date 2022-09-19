package app1.static_method;

class Demo5{
	int a,b ;
    static int count; // without static int shows an eroor
	Demo5(){
		count++;
	}
}
public class Count_No_Of_Objects {

	public static void main(String[] args) 
	{
		Demo5 d1, d2,d3 ;
		d1=new Demo5();
		d2=new Demo5();
		d3=new Demo5();
		System.out.println(" Total number of objects created = " + Demo5.count);

	}

}
