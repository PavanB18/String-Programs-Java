package Programming;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Entert he String ");
		 String a = sc.nextLine();
		 // here we are converting String to char Array
		  char [] ch =a.toCharArray();
		  // we are taking variable to Store the rev String 
		  String rev="";
		
		 for(int i=ch.length-1; i>=0; i--) {
		   rev=rev+ch[i];
		 }
		 //System.out.println(rev);
		 if(a.equals(rev)) {
			 System.out.println("Palindrome : "+rev);
		 }else
			 System.out.println("Not a palindrome");
		 sc.close();

	}

}
