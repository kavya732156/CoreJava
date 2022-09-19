package app7.methods;

class Swappp{
	int swap(int x,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		return temp;
	}
}
public class PassByValue {

	public static void main(String[] args) 
	{
		Swappp s1=new Swappp();
		int a,b;
		a=10;
		b=20;
		System.out.println(" the values of a and b  before swap "  + a + " " +b);
		s1.swap(a, b);
		System.out.println(" the values of a and b after swap "  + a + " " +b);
	}

}
