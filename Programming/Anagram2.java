package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str1 = sc.nextLine();
		   String str2 = sc.nextLine();
		   if(isAnagram(str1,str2)) {
			  System.out.println("Are Anagrams"); 
		   }else {
			   System.out.println("Not Anagrams");
		   }
	}
	
	public static boolean isAnagram(String str1 ,String str2) {
		// converting string into lower case 
		
		str1=str1.replaceAll("\\s+","").toLowerCase();
		str2=str2.replaceAll("\\s+","").toLowerCase();
		
		
		// checking length
		if(str1.length() != str2.length()) {
			return false;
		}
		
		// converting to Array
		
		char [] ch1 = str1.toCharArray();
		char [] ch2 =str2.toCharArray();
		
		
		// sorting Arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		
		return Arrays.equals(ch1, ch2);
	}

}
