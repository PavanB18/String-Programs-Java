package Programming;

import java.util.Scanner;

public class FrequencyAlpha {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String ");
		   String str=sc.nextLine();
		   
		   // convert into Array
		   char [] ch = str.toCharArray();
		   int count=0, digit=0, counter=0;
		   int vowel=0, Alpha=0, conso=0;
		   for(int i=0; i<ch.length; i++) {
			   if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='i' || ch[i]=='u') {
				   vowel++;
			   }
			   if(ch[i]>='a' && ch[i]<='z') {
				   count++;
			   }
			   else if(ch[i]>='A'  && ch[i]<='Z') {
				   Alpha++;
			   }
			   else if(ch[i]>='0' && ch[i]<='9') {
				  digit++; 
			   }
			   else {
				   counter++;
			   }
		   }
		   System.out.println("Vowels : "+vowel);
		   System.out.println("Consonent : "+conso);
		   System.out.println("Small Alphabet : "+ count);
		   System.out.println("Capital Alphabet : "+Alpha);
		   System.out.println("Digit : "+digit);
		   System.out.println("Other : "+counter);
		   sc.close();

	}

}
