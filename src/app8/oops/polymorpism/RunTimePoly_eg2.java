package app8.oops.polymorpism;

class Tree {
	void leaf() {
		System.out.println(" Tress leaf");
	}
}
class BannanaTree extends Tree{
	void leaf() {
		System.out.println("banana Tree leaf");
	}
}
public class RunTimePoly_eg2 {

	public static void main(String[] args) 
	{
		Tree t=new BannanaTree();
		t.leaf();
	}

}
