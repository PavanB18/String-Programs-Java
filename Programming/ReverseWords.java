package Programming;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str1= sc.nextLine();
		   System.out.println("original String :\n"+str1);
		   
		   //logic 
		   String [] arr = str1.split(" ");
		   String rev ="";
		   
		   for(String temp:arr) {
			   StringBuffer sb = new StringBuffer(temp);
			   sb.reverse();
			   rev=rev+sb+" ";
		   }
		   System.out.println("After spliting String \n"+rev);
           sc.close();
	}

}
