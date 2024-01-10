package Programming;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str1= sc.nextLine();
		   System.out.println("Original String : \n"+str1);
		   String rev="";
		   String [] ch = str1.split(" ");
		   for(int i=ch.length-1; i>=0; i--) {
			   rev= rev+ch[i]+" ";
		   }
		   System.out.println(rev);
		   sc.close();
	}

}
