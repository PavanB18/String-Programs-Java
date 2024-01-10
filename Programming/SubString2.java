package Programming;

import java.util.Scanner;

public class SubString2 {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the String");
		   String str= sc.nextLine();
		   
		   System.out.println("Enter the value of k");
		   int k= sc.nextInt();
		   System.out.println(getLargestAndSmallest(str,k));

	}
	
	public static String  getLargestAndSmallest(String str, int k) {
		String smallest=str.substring(0, k);
		String largest=str.substring(0, k);
		
		for(int i=1; i<str.length()-1; i++) {
			String currentStr=str.substring(i, i+k);
			
			if(currentStr.compareTo(smallest)<0) {
				currentStr=smallest;
			}
			if(currentStr.compareTo(largest)>0) {
				currentStr=largest;
			}
		}
		
		return smallest+ "\n"+ largest;
	}

}
