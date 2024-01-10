package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str = sc.nextLine();
		   // printing original String 
		   System.out.println("Original String : "+str);
		   
		   // converting String to Array
		   char [] arr = str.toCharArray();
		   // this Array for storing rev Array
		   char [] rev = new char[arr.length];
		   
		   for(int i=arr.length-1; i<=0; i++) {
			   rev[i]=arr[arr.length-1-i];
		   }
		   if(Arrays.equals(arr, rev)) {
			   System.out.println("String Palindrome");
		   }else
		   {
			   System.out.println("Not Palindrome");
		   }
           sc.close();
	}

}
