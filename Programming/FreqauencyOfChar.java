package Programming;

import java.util.Scanner;

public class FreqauencyOfChar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entert he String ");
		 String s = sc.nextLine();
		 
		 System.out.println("Enter the key to find Frequency");
		 char ch = sc.nextLine().charAt(0);
		 // logic
		 /*char [] c = s.toCharArray();
		 int idx =0;
		 for(int i=0; i<c.length; i++) {
			 if(ch==c[i]) {
				 idx++;
			 }
		 }*/
		 // another logic 
		 int  idx=0,i=0;
		 for( i=0; i<s.length(); i++) {
			 if(ch==s.charAt(i)) {
				 idx++;
			 }
		 }
		 
		 System.out.println("Frequency of "+ch+" is : "+idx);
		 sc.close();
        
	}

}
