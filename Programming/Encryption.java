package Programming;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str= sc.nextLine();
		   System.out.println("Please enter the key");
		   int key = sc.nextInt();
		   
		   char [] arr= str.toCharArray();
		   
		   for(int i=0; i<arr.length; i++) {
				   arr[i]=(char) (arr[i]+key);
		   }
		   for(int i=0; i<arr.length; i++) {
				  System.out.print(arr[i]);
			   }
		   sc.close();

	}

}
