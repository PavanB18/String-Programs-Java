package Programming;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		   System.out.println("Enter a String");
		   String str= sc.nextLine();
		   
		   // convert to Array
		   char [] ch= str.toCharArray();
		   int count=0;
		   
		   for(char i='a'; i<='z'; i++) {// i=a......
			   boolean isPanagram = false;
			   for(int j=0; j<ch.length; j++) {  // traverse through entire Array
				   
				   if(i==ch[j]) {
					 isPanagram = true;
					 break;
				   }
			   }
			   if(isPanagram==true) {
				   count++;
			   }
			   
		   }
		   System.out.println(count);
		   if(count==26) {
			   System.out.println("Given string is panagram");
		   }
		   else {
			   System.out.println("Not a panagram");
		   }
		   sc.close();
	}

}
