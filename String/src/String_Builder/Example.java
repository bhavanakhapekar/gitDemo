package String_Builder;

public class Example {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("ABCD");
	  
		sb.replace(2, 3, "AAH");
		System.out.println(sb);
		
		sb.delete(2, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
