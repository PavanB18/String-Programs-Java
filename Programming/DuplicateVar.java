package Programming;

import java.util.Scanner;

public class DuplicateVar {

	public static void main(String[] args) {
	      Scanner sc = new Scanner (System.in);
	      System.out.println("Enter the String ");
	      String str = sc.nextLine();
	      System.out.println("Original String : "+str);
	     // int idx=0;
	      
	      //logic 
	     /* char [] ch = str.toCharArray();
	      for(int i=0; i<ch.length; i++) {
	    	  int flag=0;
	    	  for(int j=0; j<i; j++) {
	    		  if(ch[i]==ch[j]) {
	    			  flag=1;
	    			  break;
	    		  } 
	    	  }
	    	  if(flag==0) { 
	    		  ch[idx]=ch[i];
	    		  idx++;
    		  }
	         }
	      for(int i=0; i<idx; i++) {
	    	  System.out.print(ch[i]);
	      }*/
	      String str2="";
	     // boolean isPresent= true;
	      for(int i=0; i<str.length(); i++) {
	    	  if(!str2.contains(str.charAt(i)+"")){
	    		  str2=str2+str.charAt(i);
	    	  }
	      }
	      System.out.println("String without duplicate : "+str2);
	      
          sc.close();
	}

}
