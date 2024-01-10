package Programming;

import java.util.Scanner;

public class Searchkey1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the string ");
	     String s = sc.nextLine();
	     char [] ch = s.toCharArray();
	     System.out.println("enter the Charcter to be search ");
	     char c = sc.next().charAt(0);
	     boolean isPresent=false;
	     int idx =0;
	     for(int i=0; i<ch.length; i++) {
	    	 if(c==ch[i]) {
	    		 isPresent=true;
	    		 break;
	    	 }
	    	 idx++;
	     }
	     if(isPresent==true) {
	    	 System.out.println("Key found At index : "+idx);
	     }else
	    	 System.out.println("Key not found");
         sc.close();
	}

}
