package app8.oops.polymorpism;

/* Delegation model has a has a relationship  it has 2 objects aggregate and composite 
 * object 
 * Aggregate obj---All object continue to leave even main method has destroyed
 * composed obj---All object destroyed once main method has destroyed
 */

class Heart{
	Heart(){
		System.out.println("Heart created");
	}
	void getHeart() {
		System.out.println(" heart pumping blood");
	}
}
class Brain{
	Brain(){
		System.out.println("Brain created");
	}
	void getBrain() {
		System.out.println(" Brain is working");
	}
}
class Car{
	Car(){
		System.out.println("car created");
	}
	void getCar() {
		System.out.println(" car used for driving");
	}
}
class Person1{
	Heart h=new Heart();
	Brain b=new Brain();
	Person1()
	{
		System.out.println("Person created with heart and Brain");
	}
	void hasA(Car c) {
		System.out.println("Persondriving that car");
	}
}
public class DelegationModel {

	public static void main(String[] args) 
	{
		Person1 p=new Person1();
		Car c=new Car();
	    p.hasA(c);
		p.h.getHeart();
		p.b.getBrain();
		c.getCar();
		
		/*output 
			Brain created
			Person created with heart and Brain
			car created
			Persondriving that car
 			heart pumping blood
 			Brain is working
 			car used for driving*/
		p=null;
		p.h.getHeart(); 
		p.b.getBrain();
		/* Cannot read field "h" because "p" is null
	                      at app8.oops.polymorpism.DelegationModel.main(DelegationModel.java:64)*/
		
		c.getCar(); // car is not destroyed even if a person object destroyed i.e aggregate
		
	}

}
