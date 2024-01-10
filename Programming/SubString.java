package Programming;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str= sc.nextLine();
		   
		   // convert array
		   char [] arr= str.toCharArray();
		   for(int i=0; i<arr.length; i++) {
			   String temp= "";
			   for(int j=i; j<arr.length; j++) {
				   temp+=arr[j];
				   System.out.println(temp);
			   }
			   
		   }
		   sc.close();
	}

}
