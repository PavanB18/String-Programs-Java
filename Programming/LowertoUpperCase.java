package Programming;

import java.util.Scanner;

public class LowertoUpperCase {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String");
		   String str= sc.nextLine();
		   
		   // convert to Array
		   char [] ch = str.toCharArray();
		   // compare with uni code values 
		   for(int i=0; i<ch.length; i++) {
			   if(ch[i]>='a' && ch[i]<='z' ) {
				   ch[i]-=32;
			   }
			   else if(ch[i]>='A' && ch[i]<='Z') {
				   ch[i]+=32;
			   }
			   System.out.print(ch[i]);
		   }
		   sc.close();

	}

	
}
