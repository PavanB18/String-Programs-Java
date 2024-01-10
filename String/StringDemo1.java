
public class StringDemo1 {

	public static void main(String[] args) {
		String str = "Kodnest TECH";
		System.out.println("Original String : "+str);
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf('z'));
		char [] ch = str.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}

	}

}
