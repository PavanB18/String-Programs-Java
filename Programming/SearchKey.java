package Programming;

import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
	     Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the string ");
	     String s = sc.nextLine();
	     
	     System.out.println("enter the Charcter to be search ");
	     char ch = sc.next().charAt(0);
	   
	     //System.out.println(s.contains(s));
	     if(s.contains(ch+"")) {
	    	 System.out.println("Key found :"+s.indexOf(ch));
	     }
	     else
	    	 System.out.println("Key not found");

	     sc.close();
	}

}
