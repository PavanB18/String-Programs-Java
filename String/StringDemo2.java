
public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Java,Python,c++,Html,JavaScript,ReactJS";
		System.out.println("Original String : "+str);
		String [] arr = str.split(",");
		for(String s:arr) {
			System.out.println(s);
		}

	}

}
