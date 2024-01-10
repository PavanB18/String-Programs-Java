
public class StringBufferDemo4 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		System.out.println("length of original String : "+sb.length());
		System.out.println("Capacity of original String ; "+sb.capacity());
		sb.append("Java");
		System.out.println("length of modified String : "+sb.length());
		System.out.println("Capacity of modified String ; "+sb.capacity());
		sb.append("is a programming lnguage");
		System.out.println("length of modified String : "+sb.length());
		System.out.println("Capacity of modified String ; "+sb.capacity());
	}

}
