package Programming;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str=sc.nextLine();
		   String res="";
		   
		   char [] arr = str.toCharArray();
		   for(int i=0; i<arr.length; i++) {
			   
			   if(arr[i]=='a') {
				   res=res+"99";
				   }
			   else {
				   res+=arr[i];
			   }
		   }
		   System.out.print(res);
	}

}
