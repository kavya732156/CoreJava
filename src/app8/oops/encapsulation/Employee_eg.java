package app8.oops.encapsulation;
class Employee{
	private String name;
	private int id;
	private float sal;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class Employee_eg {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("abc");
		e1.setAddress("Banglore");
		e1.setSal(25000);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
		System.out.println(e1.getSal());

	}

}
