package app8.oops.abstraction;

abstract class plane{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}
class Cargo extends plane{

	@Override
	void takeoff() {
		System.out.println("cargo is takeoff");
	}
	@Override
	void fly() {
		System.out.println("cargo is flying");
	}
	@Override
	void land() {
		System.out.println("cargo is landing");
	}
	
}
class Passenger extends plane{
	@Override
	void takeoff() {
		System.out.println("passenger is takeoff");
	}
	@Override
	void fly() {
		System.out.println("passenger is flying");
	}
	@Override
	void land() {
		System.out.println("passenger is landing");
	}
}
class Fighter extends plane{
	@Override
	void takeoff() {
		System.out.println("fighter is takeoff");
	}
	@Override
	void fly() {
		System.out.println("fighter is flying");
	}
	@Override
	void land() {
		System.out.println("fighteris landing");
	}
}
class airport{
	void allowplane(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class Example2 {

	public static void main(String[] args) 
	{
		Cargo c=new Cargo();
		Passenger p=new Passenger();
		Fighter f=new Fighter();
		airport a=new airport();
		a.allowplane(c);
		a.allowplane(p);
		a.allowplane(f);
		

	}

}
