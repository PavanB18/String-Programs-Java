package Programming;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("Enter the String ");
		  String str= sc.nextLine();
		  System.out.println("Original String : "+str);
		  
		  //logic 
		  StringBuilder rev = new StringBuilder();
	      rev.append(str);// to take user input in StringBuilder
	      rev.reverse();// for reversing the Given String
	      System.out.println("Reverse of String is : "+rev);
	      //here for store the above reverse String
	      String rev2 = rev.toString();
	      // here we compare String are Palindrome Are not
		  if(str.equals(rev2)) {
			  System.out.println("It is Palindrome");
		  }
		  else {
			  System.out.println("Not Palindrome");
		  }
		  sc.close();

	}

}
