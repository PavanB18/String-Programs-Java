
public class StringDemo5 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));

	}

}
