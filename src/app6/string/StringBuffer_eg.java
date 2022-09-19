package app6.string;

public class StringBuffer_eg {

	public static void main(String[] args) 
	{
		String state="karnataka";
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer(state);
		System.out.println(sb);
		sb.reverse();
		String s=sb.toString();
		System.out.println(s);
	}

}
