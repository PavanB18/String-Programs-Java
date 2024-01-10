package Programming;

import java.util.Scanner;

public class SubString1 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str= sc.nextLine();
		   String longestSubstring="";
		   
		   // convert to Array
		   char [] arr= str.toCharArray();
		   
		   for(int i=0; i<arr.length; i++) {
		   String temp= "";
		   for(int j=i; j<arr.length; j++) {
			   
			   temp+=arr[j];
			   if (temp.length() > longestSubstring.length()) {
                   longestSubstring = temp;
               }
			   System.out.println(temp);
			  
		       }
		   }
		  System.out.println("longest substring : "+longestSubstring); 
		  sc.close();
	}

}
