
public class StringBufferDemo3 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hii");
		StringBuffer sb2 = new StringBuffer("Hii");
		//sb1.append("Hello");
		//sb2.append("Hello");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		System.out.println(sb1);
     // why output is false even though values of sb1 & sb2 are same?
	}
																						
}
