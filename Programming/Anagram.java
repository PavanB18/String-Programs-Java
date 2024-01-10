package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// String inputs
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the first String ");
		   String str1=sc.nextLine();
		   System.out.println("Enter the 2nd String ");
		   String str2=sc.nextLine();
		  // convert str to Array
		   char [] ch1=str1.toCharArray();
		   char [] ch2=str2.toCharArray();
		   // sort 2 Arrays
		   Arrays.sort(ch1);
		   Arrays.sort(ch2);
		   // compare 2 Arrays  
		   if(Arrays.equals(ch1, ch2)) {
		   System.out.println("Anagram");
		   }
		   else {
			   System.out.println("Not a Anagram");
		   }
           sc.close();
	}

}
