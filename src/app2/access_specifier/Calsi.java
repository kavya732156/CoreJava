package app2.access_specifier;

public class Calsi {

	public static void main(String[] args) 
	{
		Cal c1=new Cal();
		c1.add(20, 30);
		c1.sub(80, 20);
		c1.mul(40, 9);
		c1.div(30,3); // its access type is protected it can not be accessed outside the calss

	}

}
