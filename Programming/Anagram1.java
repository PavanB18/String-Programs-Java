package Programming;

import java.util.Scanner;

public class Anagram1 {
	
	public static void bubbleSort(char arr[]) {
		 int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	}
	public static void main(String[] args) {
		// String inputs
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the first String ");
		   String str1=sc.nextLine();
		   System.out.println("Enter the 2nd String ");
		   String str2=sc.nextLine();
		  // convert str to Array
		   char [] ch1=str1.toCharArray();
		   char [] ch2=str2.toCharArray();
		   // sort above Array using bubble sort 
		   bubbleSort(ch1);
		   bubbleSort(ch2);
		   
		  // compare the Array
		   boolean isAnagram=true;
		   if(ch1.length != ch2.length) {
			   isAnagram=false;
			}else
			{
				for(int i=0; i<ch1.length; i++) {
					if(ch1[i] != ch2[i]) {
						isAnagram=false;
						break;
					}
				}
		   
		   if(isAnagram) {
			   System.out.println("Anagram");
		   }
		   else
			   System.out.println("Not a Anagram");
		   }
		   sc.close();
		   
    }
}
