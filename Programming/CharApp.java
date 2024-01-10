package Programming;
import java.util.*;
public class CharApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Character");
		char ch = sc.nextLine().charAt(0);
        charPres(ch);
	}
	public static void charPres(char ch) {
		if(ch >='a' && ch <= 'z') {
			System.out.println("Lower Case Letter");
		}else if( ch >= 'A' && ch <='Z') {
			System.out.println("UpperCase Letter");
		}
		else if( ch >= '0' && ch <= '9') {
			System.out.println("It's Digit.");
		}else {
			System.out.println("Special Character");
		}
	}

}
