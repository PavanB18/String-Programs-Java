
public class StringBufferDemo1 {
	// StringBuffer only has reverse method

	public static void main(String[] args) {
	     StringBuffer sb = new StringBuffer();
	     System.out.println(sb.length());
	     sb.append("Java");
	     System.out.println(sb.length());
	     
	     System.out.println(sb.charAt(2));
	     System.out.println(sb.indexOf("a"));
	     sb.reverse();
	     System.out.println(sb);

	}

}
