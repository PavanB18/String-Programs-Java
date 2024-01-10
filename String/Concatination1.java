
public class Concatination1 {

	public static void main(String[] args) {
		String s1 ="kod";// store in String pool
		String s2="nest";// store i String pool
		String  s3 = s1+s2;// Store in heap memory
		String s4=s1.concat(s2);//store in String pool 
		String s5=s1+"nest";// heap memory
		String s6=s1.concat("nest");// String pool
		String s7= "kod"+"nest";//Heap memory
		String s8 = "kod".concat("nest");// String pool
		
		String str= "kodnest";
		System.out.println(s4==str);
		System.out.println(s3==str);
		System.out.println(s5==str);
		System.out.println(s6==str);
		System.out.println(s7==str);
		System.out.println(s8==str);

	}

}
