package Programming;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the String ");
		  String str1= sc.nextLine();
		  System.out.println("Original String : \n"+str1);
		  String [] arr = str1.split(" ");
		  
          String rev="";
          for(int i=arr.length-1; i>=0; i--) {
        	  rev=rev+arr[i]+" ";
          }
          System.out.println("String after spliting : \n"+rev);
          sc.close();
	}

}
